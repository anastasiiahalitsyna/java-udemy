package com.anastasiia.elmar.exception;

import java.math.BigDecimal;

public class SalaryService {
    BigDecimal calSalary(int hours, BigDecimal wage) {
        if (hours < 0) {
            throw new InvalidHoursException("Invalid salary");
        }
        if (wage.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidWageException("Invalid Wage");
        }

        return wage.multiply(new BigDecimal(hours));
    }
}
