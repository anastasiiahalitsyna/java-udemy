package com.anastasiia.inheritanceAndPOlymorphism.HMS4;

public class BlueCrossBlueShield implements InsuranceBrand {

    private long id;
    private String name;

    @Override
    public double computeMonthlyPremium(HealthInsurancePlan healthInsurancePlan,
                                        int age,
                                        boolean smoking) {

        double premium = 0;
        if (healthInsurancePlan instanceof PlatinumPlan) {
            if (age > 55) {
                premium += 200;
            }

            if (smoking) {
                premium += 100;
            }


        } else if (healthInsurancePlan instanceof GoldPlan) {
            if (age > 55) {
                premium += 150;
            }

            if (smoking) {
                premium += 90;
            }

        } else if (healthInsurancePlan instanceof SilverPlan) {
            if (age > 55) {
                premium += 100;
            }

            if (smoking) {
                premium += 80;
            }

        } else if (healthInsurancePlan instanceof BronzePlan) {
            if (age > 55) {
                premium += 50;
            }

            if (smoking) {
                premium += 70;
            }
        }

        return premium;
    }




    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }



}
