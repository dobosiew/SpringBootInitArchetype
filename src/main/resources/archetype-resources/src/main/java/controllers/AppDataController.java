package ${package}.controllers;

import ${package}.domain.appdata.AppDataRepository;
import ${package}.domain.appdata.AppData;
import ${package}.security.ApplicationUser;
import ${package}.security.AuthUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

@RestController
@RequestMapping("/data")
public class AppDataController {

    AppDataRepository appDataRepository;

    @Autowired
    public AppDataController(AppDataRepository appDataRepository) {
        this.appDataRepository = appDataRepository;
    }

    @GetMapping("/{dataId}")
    public Callable<AppData> getApplicationdata(@PathVariable Long dataId,
                                                @ApplicationUser AuthUser authUser) {

        return () -> appDataRepository.getApplicationDataById(dataId);
    }
}
