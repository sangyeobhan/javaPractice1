package paymentPolicy;

import customer.Customer;

public interface Payment {

    double amountPaid(double price, Customer customer);
}
