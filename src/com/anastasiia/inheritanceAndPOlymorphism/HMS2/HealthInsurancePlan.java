package com.anastasiia.inheritanceAndPOlymorphism.HMS2;

import com.anastasiia.inheritanceAndPOlymorphism.HMS2.InsuranceBrand;

public class HealthInsurancePlan {

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
}
