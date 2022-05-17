package com.anastasiia.inheritanceAndPOlymorphism.HMS2;

public class Billing {


    public static double[] computePaymentAmount(Patient patient, double amount) {
        final double[] payments = new double[2];
        double additionalDiscount = 20;

        final HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        if (patientInsurancePlan == null) {
            payments[0] = 0;
            payments[1] = amount - additionalDiscount;
            return payments;
        }

        if (patientInsurancePlan instanceof PlatinumPlan) {
            additionalDiscount = 50;
        } else if (patientInsurancePlan instanceof GoldPlan) {
            additionalDiscount = 40;
        } else if (patientInsurancePlan instanceof SilverPlan) {
            additionalDiscount = 30;
        } else if (patientInsurancePlan instanceof BronzePlan) {
            additionalDiscount = 25;
        }

        payments[0] = amount * patientInsurancePlan.getCoverage();
        payments[1] = amount - payments[0] - additionalDiscount;

        return payments;
    }
}
