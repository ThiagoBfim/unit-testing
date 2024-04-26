package org.example.service;

import org.example.domain.Company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CompanyService {


    public BigDecimal calculateEmployeesSumSalary(Company company) {
        return company.getSumEmployeesSalary();
    }

    public BigDecimal calculateEmployeesAvgSalary(Company company) {
        return company.getSumEmployeesSalary().divide(BigDecimal.valueOf(company.employees().size()), RoundingMode.DOWN);
    }
}
