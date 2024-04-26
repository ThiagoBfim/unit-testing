package org.example.domain;

import java.math.BigDecimal;
import java.util.List;

public record Company(List<Employee> employees) {

    public BigDecimal getSumEmployeesSalary() {
        return employees.stream().map(Employee::getSalary).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
