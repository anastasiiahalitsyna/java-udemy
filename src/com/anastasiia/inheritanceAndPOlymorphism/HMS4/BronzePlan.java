package com.anastasiia.inheritanceAndPOlymorphism.HMS4;

public class BronzePlan extends HealthInsurancePlan {

    public BronzePlan() {
        setCoverage(0.6);
    }

    @Override
    public double computeMonthlyPremium(double salary, int age, boolean smoking) {
        return salary * 0.05 + getOfferedBy().computeMonthlyPremium(this, age, smoking);
    }
}
