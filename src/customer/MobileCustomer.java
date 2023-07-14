package customer;

import paymentPolicy.PaymentPolicy;

public class MobileCustomer extends Customer {
    public MobileCustomer(String name, Membership membership, PaymentPolicy discountMethod){
        super(name, membership, discountMethod);
    }

    @Override
    public void printCustomer() {
        System.out.printf("접속 경로: Mobile\n");
        printNameAndMembership();
    }
}
