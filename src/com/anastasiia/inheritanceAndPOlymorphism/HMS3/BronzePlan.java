package com.anastasiia.inheritanceAndPOlymorphism.HMS3;

public class BronzePlan extends HealthInsurancePlan {
    public BronzePlan() {
        setCoverage(0.6);
    }

    @Override
    public double computeMonthlyPremium(double salary) {

        return salary * 0.05;
    }
}
