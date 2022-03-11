package com.anastasiia.methods.task2;

import java.time.LocalDate;

public class CarPriceEstimator {

    public double getSalePrice(String makeAndModel,
                               int yearManufactured,
                               double milesDriven,
                               int airBagsCount,
                               boolean hasAbs,
                               boolean hasEbd,
                               boolean hasRearCamera,
                               boolean hasSunRoof,
                               boolean hasAutoAC,
                               boolean hasAccidentHistory) {

        double salePrice = getPrice(makeAndModel, yearManufactured);
        int currentYear = LocalDate.now().getYear();
        int ageOfCar = currentYear - yearManufactured + 1;

        System.out.println("age of Car " + ageOfCar);

        if (ageOfCar <= 10) {
            salePrice -= salePrice * 0.05 * ageOfCar;
        } else {
            return salePrice * 0.1;
        }

        System.out.println("salePrice after depreciation: " + salePrice);

        if (airBagsCount < 2 || !hasAbs || !hasEbd) {
            salePrice -= 1000;
        }
        System.out.println("salePrice after accounting for security features: " + salePrice);


        if (hasRearCamera && (hasSunRoof || hasAutoAC)) {
            salePrice += 500;
        }

        System.out.println("salePrice after accounting for comfort features: " + salePrice);


        if (hasAccidentHistory) {
            salePrice -= 500;
        }

        System.out.println("salePrice after accounting for past accidents: " + salePrice);

        double expectedMilesDriven = ageOfCar * 10000.0;
        double additionalMiles = milesDriven - expectedMilesDriven;

        if (additionalMiles > 1000 && additionalMiles <= 10000) {
            salePrice -= 500;
        } else if (additionalMiles > 10000 && additionalMiles <= 30000) {
            salePrice -= 1000;
        } else if (additionalMiles > 30000) {
            salePrice -= 1500;
        }
        System.out.println("salePrice after accounting for miles driven: " + salePrice);

        return salePrice;
    }


    private double getPrice(String makeAndModel, int yearManufactured) {
        if (makeAndModel.equalsIgnoreCase("ford ecosport")) {
            return 20000.0;
        } else if (makeAndModel.equalsIgnoreCase("honda city")) {
            return 25000.0;
        } else if (makeAndModel.equalsIgnoreCase("toyota camry hybrid")) {
            return 30000.0;
        }
        return 20000.0;
    }

    public static void main(String[] args) {
        CarPriceEstimator carPriseEstimator = new CarPriceEstimator();
        double salesPrice = carPriseEstimator.getSalePrice("ford ecosport",
                2021,
                60000.0, 1, true, false, true,
                false, false, true);
        System.out.println("Final price is: " + salesPrice);
    }
}