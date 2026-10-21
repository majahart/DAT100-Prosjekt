package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {
        customers = new Customer[size];
    }

    // b) count number of non-null references
    public int countNonNull() {
        int count = 0;
        for (Customer a: customers)
            if (a != null){
                count += 1;
            }
        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        boolean funnet = false;
        Customer c = null;

        for (Customer current: customers)
            if (customer_id == current.getCustomer_id()){
                c = current;
                funnet = true;
                break;
            }
        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        for (int i = 0; i < customers.length; i++){
            if (customers[i] == null){
                customers[i] = c;
                inserted = true;
                break;
            }
        }
        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getCustomer_id() == customer_id) {
                c = customers[i];
                customers[i] = null;
                deleted = true;
                break;
            }
        }
        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] currentCustomers = new Customer[countNonNull()];

        for (Customer current: customers){
            int i = 0;
            if (current != null){
                currentCustomers[i] = current;
                i++;
            }
        }

        return currentCustomers;
    }
}