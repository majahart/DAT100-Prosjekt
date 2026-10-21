package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer c1 = new Customer();

        System.out.println(c1.toString());

        c1.setName("Svale");
        c1.setEmail("syktkul@email.no");
        c1.setCustomer_id(69);
        c1.setAgreement(PowerAgreementType.NORGESPRICE);

        System.out.println(c1.toString());

        Customer c2 = new Customer("Dansk fyr", "DumDårlig@email.dk", 420, PowerAgreementType.SPOTPRICE);

        System.out.println(c2.toString());
        /*


         Write code that creates a Customer object and teste the methods implemented in the class

        */
    }
}
