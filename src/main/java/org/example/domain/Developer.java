package org.example.domain;

import java.math.BigDecimal;

public class Developer extends Employee {
    public Developer(String name, BigDecimal salary) {
        super(name, salary);
    }

    @Override
    public BigDecimal calculateNetSalary() {
        return getSalary().subtract(getSalary().multiply(BigDecimal.valueOf(0.20)));
    }
}
