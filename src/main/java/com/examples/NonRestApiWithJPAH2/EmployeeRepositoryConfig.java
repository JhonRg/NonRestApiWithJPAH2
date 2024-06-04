package com.examples.NonRestApiWithJPAH2;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackageClasses = {EmployeeRepository.class})
public class EmployeeRepositoryConfig {

}
