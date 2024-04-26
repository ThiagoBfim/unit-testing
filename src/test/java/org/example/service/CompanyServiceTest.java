package org.example.service;

import org.example.domain.Company;
import org.example.domain.Developer;
import org.example.domain.Manager;

import java.math.BigDecimal;
import java.util.List;

class CompanyServiceTest {

    @org.junit.jupiter.api.Test
    void calculateEmployeesSumSalary() {
        CompanyService companyService = new CompanyService();
        Company company = new Company(
                List.of(
                        new Developer("James", BigDecimal.valueOf(5_000)),
                        new Manager("Jessie", BigDecimal.valueOf(8_000), BigDecimal.valueOf(2_000))
                )
        );
        BigDecimal bigDecimal = companyService.calculateEmployeesSumSalary(company);
        org.assertj.core.api.Assertions.assertThat(bigDecimal).isEqualTo(BigDecimal.valueOf(13_000));
    }

    @org.junit.jupiter.api.Test
    void calculateEmployeesAvgSalary() {

    }
}