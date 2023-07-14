package paymentPolicy;

import customer.Customer;

public class DiscountPayment implements Payment {
    @Override
    public double amountPaid(double price, Customer customer) {
        return price * (1 - customer.getMembership().getDiscountRate());
    }
}
