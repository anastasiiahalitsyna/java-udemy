package com.anastasiia.methods.task1;

class MoneyTransferService {
    CurrencyConverter cc = new CurrencyConverter();

    public static void main(String[] args) {
        MoneyTransferService transferService = new MoneyTransferService();

        double transferAmount = transferService.computeTransferAmount(0, 1000);

        double transferFee = transferService.computeTransferFee(0, 1000);

        System.out.println("Transfer Amount: " + transferAmount);

        System.out.println("Transfer Fee: " + transferFee);
    }

    double computeTransferAmount(int countryIndex, double amount) {
        return (double) cc.getExchangeRate(countryIndex) * amount;
    }

    double computeTransferFee(int countryIndex, double amount) {
        return (double) computeTransferAmount(countryIndex, amount) * 0.02;
    }

    public static class CurrencyConverter {
        double[] exchangeRates = new double[]{63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};

        void setExchangeRates(double[] rates) {
            exchangeRates = rates;
        }

        void updateExchangeRate(int countryIndex, double newVal) {
            exchangeRates[countryIndex] = newVal;
        }

        double getExchangeRate(int countryIndex) {

            return exchangeRates[countryIndex];

        }

        double computeTransferAmount(int countryIndex, double amount) {

            return amount * getExchangeRate(countryIndex);

        }

        public static void main(String[] args) {
            CurrencyConverter cc = new CurrencyConverter();
            double[] rates = {63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};
            cc.setExchangeRates(rates);

            cc.printCurrencies();

            rates = new double[]{65.0, 5.0, 3.0, 595.5, 18.0, 107.0, 2.0};
            cc.setExchangeRates(rates);

            cc.printCurrencies();

            cc.updateExchangeRate(0, 66.0);
            cc.printCurrencies();

            double amount = cc.computeTransferAmount(0, 1000);
            System.out.println("\nTransferred amount: " + amount);
            cc.printCurrencies();

        }

        void printCurrencies() {
            System.out.println("rupee: " + exchangeRates[0]);
            System.out.println("dircham: " + exchangeRates[1]);
            System.out.println("real: " + exchangeRates[2]);
            System.out.println("chilean_peso: " + exchangeRates[3]);
            System.out.println("mexican_peso: " + exchangeRates[4]);
            System.out.println("_yet: " + exchangeRates[5]);
            System.out.println("$australian: " + exchangeRates[exchangeRates.length - 1]);
        }
    }
}