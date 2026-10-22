package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave1.DailyPower;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;

    }

    public void computeAmount() {

        this.amount = 0;

        for (int i = 0; i < usage.length; i++) {

            if (c.getAgreement() == PowerAgreementType.NORGESPRICE) {
                amount += DailyPower.computeNorgesPrice(usage[i]);
            } else if (c.getAgreement() == PowerAgreementType.SPOTPRICE){
                amount += DailyPower.computeSpotPrice(usage[i], prices[i]);
            } else {
                amount += DailyPower.computeSpotPrice(usage[i], prices[i]) - DailyPower.computePowerSupport(usage[i], prices[i]);
            }
        }
    }
    public void printInvoice() {

        System.out.println(c);
        System.out.println("Month: " + month);

        double totalUsage = 0;

        for (int i = 0; i < usage.length; i++) {

            totalUsage += DailyPower.computePowerUsage(usage[i]);
        }

        System.out.printf("Usage: %.2f kWh\n", totalUsage);
        computeAmount();
        System.out.printf("Amount: %.2f NOK\n", amount);

    }
}
