package com.anastasiia.inheritanceAndPOlymorphism.HMS3;

public class PlatinumPlan extends HealthInsurancePlan {
    public PlatinumPlan() {
        setCoverage(0.9);
    }

    @Override
    public double computeMonthlyPremium(double salary) {

        return salary * 0.08;
    }


}
