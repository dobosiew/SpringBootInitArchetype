package ${package}.domain.appdata;

import ${package}.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("integrationtests")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class AppDataRepositoryIT {

    @Autowired
    private AppDataRepository appDataRepository;

    @Test
    public void printData() {
        Stream.of(appDataRepository.getApplicationDataById(1L))
                .forEach(System.out::println);
    }

    @Test
    public void complicatedQuery(){
        assertThat(appDataRepository.complicatedQuery())
                .isPositive();
    }

}
