package org.example.domain;

import java.math.BigDecimal;

public class Manager extends Employee {

    private final BigDecimal bonus;

    public Manager(String name, BigDecimal salary, BigDecimal bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public BigDecimal calculateNetSalary() {
        return getSalary().subtract(getSalary().multiply(BigDecimal.valueOf(0.20))).add(bonus);
    }
}
