package ${package}.security;

import ${package}.domain.appuser.AppUser;
import ${package}.domain.appuser.AppUserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class ApplicationUserService implements UserDetailsService {

    private AppUserRepository appUserRepository;

    public ApplicationUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        AppUser calendarUser = appUserRepository.getAppUserByUsername(username);

        if (calendarUser == null) {
            throw new UsernameNotFoundException("Username: " + username + " not found");
        }
        return new AuthUser(calendarUser);
    }
}
