package ${package}.domain.appdata;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppDataRepository extends JpaRepository<AppData, Long>, AppDataInterface {

    public AppData getApplicationDataById(Long id);
}
