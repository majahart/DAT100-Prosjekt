package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers c1 = new Customers(10);

        System.out.println(c1.countNonNull());

        c1.addCustomer(new Customer("svale","mail.co",5,PowerAgreementType.NORGESPRICE));

        System.out.println(c1.countNonNull());

        System.out.println(c1.getCustomer(5).toString());

        System.out.println(c1.getCustomers().length);

        System.out.println(c1.removeCustomer(5));

        System.out.println(c1.getCustomers().length);

        System.out.println(c1.countNonNull());
        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */

    }
}
