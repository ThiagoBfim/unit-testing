package org.example.domain;

import org.assertj.core.api.SoftAssertions;
import org.example.exception.InvalidSalaryException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class DeveloperTest {

    @Test
    void testDeveloperAttributes() {
        Developer ashKetchum = new Developer("Ash Ketchum", BigDecimal.valueOf(2_000));
        SoftAssertions.assertSoftly(s -> {
            s.assertThat(ashKetchum.getSalary()).isEqualTo(BigDecimal.valueOf(2_000));
            s.assertThat(ashKetchum.calculateNetSalary()).isEqualByComparingTo(BigDecimal.valueOf(1_500));
            s.assertThat(ashKetchum.getName())
                    .startsWith("Ash")
                    .endsWith("Ketchum2");
        });
    }

    @Test
    void testDeveloperSalary() {
        org.assertj.core.api.Assertions
                .assertThatThrownBy(() -> new Developer("Brock", BigDecimal.valueOf(800)))
                .isInstanceOf(InvalidSalaryException.class)
                .hasMessage("The salary should be bigger than the minimum salary (1.000)");
    }
}