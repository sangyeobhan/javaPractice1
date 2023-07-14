package customer;

import paymentPolicy.PaymentPolicy;

public class WebCustomer extends Customer{
    public WebCustomer(String name, Membership membership, PaymentPolicy paymentPolicy) {
        super(name, membership, paymentPolicy);
    }

    @Override
    public void printCustomer() {
        System.out.printf("접속 경로: Web\n");
        printNameAndMembership();
    }
}
