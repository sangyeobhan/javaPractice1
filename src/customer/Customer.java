package customer;

import paymentPolicy.PaymentPolicy;

import java.util.Objects;

public abstract class Customer {
    private String name;
    private Membership membership;
    private PaymentPolicy paymentPolicy;

    public Customer(String name, Membership membership, PaymentPolicy paymentPolicy) {
        this.name = name;
        this.membership = membership;
        this.paymentPolicy = paymentPolicy;
    }

    public String getName() {
        return name;
    }
    public Membership getMembership() {
        return membership;
    }

    public PaymentPolicy getPaymentPolicy() {
        return paymentPolicy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public void setPaymentPolicy(PaymentPolicy paymentPolicy) {
        this.paymentPolicy = paymentPolicy;
    }

    public abstract void printCustomer();
    public void printNameAndMembership(){
        System.out.printf("이름: %s\n", getName());
        System.out.printf("등급: %s\n", getMembership());
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        return this.name.equals(((Customer)o).name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
