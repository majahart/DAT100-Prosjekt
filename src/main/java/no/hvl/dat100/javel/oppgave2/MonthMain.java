package no.hvl.dat100.javel.oppgave2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */
    //a
        System.out.println("Oppgave a:");
        MonthlyPower.print_PowerUsage(power_usage_month);

    //b
        System.out.println("Oppgave b:");
        MonthlyPower.print_PowerPrices(power_prices_month);

    //c
        System.out.println("Oppgave c:");
        double total = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.println("Totalt strømforbruk: " + total + " kWh");

    //d
        System.out.println("Oppgave d:");
        boolean hytte = MonthlyPower.exceedThreshold(power_usage_month, 1000);
        boolean bolig = MonthlyPower.exceedThreshold(power_usage_month, 5000);
        System.out.println("Over 1000 kWh: " + hytte);
        System.out.println("Over 5000 kWh: " + bolig);

    //e
        System.out.println("Oppgave e:");
        double spotpris = MonthlyPower.computeSpotPrice(
                power_usage_month, power_prices_month);
        System.out.println("Total spotpris: " + spotpris + " kr");

    //f
        System.out.println("Oppgave f:");
        double stotte = MonthlyPower.computePowerSupport(
                power_usage_month, power_prices_month);
        System.out.println("Total strømstøtte: " + stotte + " kr");

    //g
        System.out.println("Oppgave g:");
        double norgespris = MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.println("Total Norgespris: " + norgespris + " kr");
    }
}