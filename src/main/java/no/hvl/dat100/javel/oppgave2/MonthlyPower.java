package no.hvl.dat100.javel.oppgave2;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for (int dag = 0; dag < usage.length; dag++) {
            System.out.print("Day " + (dag + 1) + ": ");

            for (int time = 0; time < usage[dag].length; time++) {
                System.out.printf("%.2f kWh ", usage[dag][time]);
            }

        System.out.println();
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int dag = 0; dag < prices.length; dag++) {
            System.out.print("Day " + (dag + 1) + ": ");

            for (int time = 0; time < prices[dag].length; time++) {
                System.out.printf("%.2f kr ", prices[dag][time]);
            }
            System.out.println();
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int dag = 0; dag < usage.length; dag++) {

            for (int time = 0; time < usage[dag].length; time++) {
                sum = sum + usage[dag][time];
            }
        }
        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        double usage = 0;
        int dag = 0;

        while (dag < powerusage.length) {
            int time = 0;

            while (time < powerusage[dag].length) {
                usage = usage + powerusage[dag][time];

                if (usage > threshold) {
                    return true;
                }
                time++;
            }
            dag++;
        }
        return false;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int dag = 0; dag < usage.length; dag++) {

            for (int time = 0; time < usage[dag].length; time++) {
                price = price + usage[dag][time] * prices[dag][time];
            }
        }
        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {
        double support = 0;

        for (int dag = 0; dag < usage.length; dag++) {

            for (int time = 0; time < usage[dag].length; time++) {

                if (prices[dag][time] > 0.9375) {
                    support = support + usage[dag][time]
                            * (prices[dag][time] - 0.9375) * 0.90;

                }
            }
        }
        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {
        double price = 0;

        for (double[] dag : usage) {

            for (double time : dag) {
                price = price + time * 0.50;
            }
        }
        return price;
    }

}
