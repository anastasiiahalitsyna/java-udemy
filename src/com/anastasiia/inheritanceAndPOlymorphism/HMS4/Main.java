package com.anastasiia.inheritanceAndPOlymorphism.HMS4;

public class Main {
    public static void main(String[] args) {
        User staff = new User();
        InsuranceBrand insuranceBrand = new BlueCrossBlueShield();

        HealthInsurancePlan healthInsurancePlan = new PlatinumPlan();
        healthInsurancePlan.setOfferedBy(insuranceBrand);
        staff.setInsurancePlan(healthInsurancePlan);
        double monthlyPremium = healthInsurancePlan.computeMonthlyPremium(5000, 56, true);
        System.out.println(monthlyPremium);

    }
}
