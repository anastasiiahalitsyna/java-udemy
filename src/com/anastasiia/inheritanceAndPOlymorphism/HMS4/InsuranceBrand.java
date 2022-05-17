package com.anastasiia.inheritanceAndPOlymorphism.HMS4;

public interface InsuranceBrand {


     long getId();

     void setId(long id);

     String getName();

     void setName(String name);

     double computeMonthlyPremium(HealthInsurancePlan insurancePlan,
                                  int age,
                                  boolean smoking);


}
