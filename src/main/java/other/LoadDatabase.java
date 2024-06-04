package other;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import payroll.Employee;
import payroll.EmployeeRepository;

@Configuration
@EnableJpaRepositories(basePackageClasses = other.LoadDatabase.class)
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository){

        return args -> {
            log.info("Preloading " + repository.save(Employee.builder().name("Jonatan").role("Jefe").build()));
            log.info("Preloading " + repository.save(Employee.builder().name("Selene").role("Jefa").build()));
        };
    }
}
