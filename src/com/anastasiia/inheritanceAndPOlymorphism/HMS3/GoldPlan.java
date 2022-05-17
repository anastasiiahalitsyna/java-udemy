package com.anastasiia.inheritanceAndPOlymorphism.HMS3;

public class GoldPlan extends HealthInsurancePlan {
    public GoldPlan() {
        setCoverage(0.8);
    }

    @Override
    public double computeMonthlyPremium(double salary) {

        return salary * 0.07;
    }

}
