package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */
        // a)
        DailyPower.printPowerPrices(DayPowerData.powerprices_day);
        System.out.println();
        // b)
        DailyPower.printPowerUsage(DayPowerData.powerusage_day);
        System.out.println();
        //c)
        System.out.println(DailyPower.computePowerUsage(DayPowerData.powerusage_day) + " kWh");
        //d)
        System.out.printf("%.2f NOK", DailyPower.computeSpotPrice(DayPowerData.powerusage_day,DayPowerData.powerprices_day));
        System.out.println();
        //e)
        System.out.printf("%.2f NOK", DailyPower.testSupport(3.0, 2.0));
        System.out.println();
        //f)
        System.out.printf("%.2f NOK", DailyPower.computePowerSupport(DayPowerData.powerusage_day, DayPowerData.powerprices_day));
        System.out.println();
        //g)
        System.out.printf("%.2f NOK", DailyPower.computeNorgesPrice(DayPowerData.powerusage_day));
        System.out.println();
        //h)
        System.out.printf("Det største forbruket i løpet av en time var %.2f kWh", DailyPower.findPeakUsage(powerusage_day));
        System.out.println();
        //i)
        System.out.printf("Gjennomsnittsforbruket var %.2f kWh", DailyPower.findAvgPower(powerusage_day));

    }
}
