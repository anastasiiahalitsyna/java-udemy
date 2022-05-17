package com.anastasiia.inheritanceAndPOlymorphism.HMS3;


public class User {
    private boolean insured;
    private HealthInsurancePlan insurancePlan;

    public boolean isInsured() {
        return insured;
    }

    public void setInsured(boolean insured) {
        this.insured = insured;
    }

    public HealthInsurancePlan getInsurancePlan() {
        return insurancePlan;
    }

    public void setInsurancePlan(HealthInsurancePlan insurancePlan) {
        this.insurancePlan = insurancePlan;
    }
}
