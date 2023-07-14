package paymentPolicy;

import customer.Customer;

public class BonusPayment implements Payment {

    public double getBonusAmount(double price, Customer customer) {
        return price * customer.getMembership().getDiscountRate();
    }
    @Override
    public double amountPaid(double price, Customer customer) {
        return price;
    }
}
