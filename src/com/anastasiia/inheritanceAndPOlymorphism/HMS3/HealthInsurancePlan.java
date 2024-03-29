package com.anastasiia.inheritanceAndPOlymorphism.HMS3;


abstract class HealthInsurancePlan {
    private double coverage;
    private InsuranceBrand offeredBy;

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    public InsuranceBrand getOfferedBy() {
        return offeredBy;
    }

    public void setOfferedBy(InsuranceBrand offeredBy) {
        this.offeredBy = offeredBy;
    }

    public abstract double computeMonthlyPremium(double salary);
}
