package org.example.domain;

import org.example.exception.InvalidSalaryException;

import java.math.BigDecimal;

public abstract class Employee {
    private final String name;
    private final BigDecimal salary;

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
        if (salary.compareTo(BigDecimal.valueOf(1_000)) < 0) {
            throw new InvalidSalaryException("The salary should be bigger than the minimum salary (1.000)");
        }
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public abstract BigDecimal calculateNetSalary();
}
