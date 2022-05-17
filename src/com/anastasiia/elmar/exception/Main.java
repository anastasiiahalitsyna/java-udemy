package com.anastasiia.elmar.exception;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        SalaryService salaryService = new SalaryService();
        try {
            BigDecimal salary = salaryService.calSalary(-30, new BigDecimal(70));
            System.out.println(salary);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Your wage was given not correct!" +
                    " Probably you gave some negative value. Try again!");
        } finally {
            System.out.println("Your salary was count ");
        }


    }
}
