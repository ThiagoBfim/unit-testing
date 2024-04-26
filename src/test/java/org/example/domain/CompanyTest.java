package org.example.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void testCompanyType() {
        org.assertj.core.api.Assertions.assertThat(Company.class).isRecord();
    }

    @Test
    void testEmployees() {
        Company company = new Company(
                List.of(
                        new Developer("James", BigDecimal.valueOf(5_000)),
                        new Manager("Jessie", BigDecimal.valueOf(8_000), BigDecimal.valueOf(2_000))
                )
        );
        org.assertj.core.api.Assertions.assertThat(company.employees())
                .extracting(Employee::getName)
                .contains("James", "Jessie")
                .doesNotContain("Ash");
    }
}