package com.examples.NonRestApiWithJPAH2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import payroll.Employee;
import payroll.EmployeeRepository;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository){

        return args -> {
            log.info("Preloading " + employeeRepository.save(Employee.builder().name("Jonatan").role("Jefe").build()));
            log.info("Preloading " + employeeRepository.save(Employee.builder().name("Selene").role("Jefa").build()));
        };
    }
}
