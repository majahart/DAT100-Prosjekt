package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        //a)

        Customer Jorgen = new Customer("Jørgen Skalle","jorgen@hvl.no",67,PowerAgreementType.SPOTPRICE);
        Invoice fakturaJ = new Invoice(Jorgen,"Januar",CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);

        Customer Svale = new Customer("Svale","svale@hvl.no",420,PowerAgreementType.POWERSUPPORT);
        Invoice fakturaS = new Invoice(Svale,"Januar",CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);

        Customer Maja = new Customer("Maja","maja@hvl.no",2006,PowerAgreementType.NORGESPRICE);
        Invoice fakturaM = new Invoice(Maja,"Januar",CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);


        //b)
        fakturaJ.computeAmount();
        fakturaS.computeAmount();
        fakturaM.computeAmount();

        //c)
        fakturaJ.printInvoice();
        System.out.println();

        //d)
        Invoice[] invoices = {fakturaS, fakturaM, fakturaJ};

        Invoices.processInvoices(invoices);
    }
}
