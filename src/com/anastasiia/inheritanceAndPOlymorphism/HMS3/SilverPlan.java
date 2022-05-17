package com.anastasiia.inheritanceAndPOlymorphism.HMS3;

public class SilverPlan extends HealthInsurancePlan {
    public SilverPlan() {
        setCoverage(0.7);
    }

    @Override
    public double computeMonthlyPremium(double salary) {

        return salary * 0.06;
    }
}
