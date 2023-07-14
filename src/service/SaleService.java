package service;

import customer.Customer;
import paymentPolicy.BonusPayment;
import paymentPolicy.DiscountPayment;
import paymentPolicy.PaymentPolicy;

public class SaleService {
    BonusPayment bonusPayment = new BonusPayment();
    DiscountPayment discountPayment = new DiscountPayment();

    public void processPayment(double price, Customer customer){
        customer.printCustomer();
        if(customer.getPaymentPolicy() == PaymentPolicy.BONUS) {
            System.out.println("결제 방식: 보너스 결제 방식");
            System.out.printf("보너스: %s\n", (int) bonusPayment.getBonusAmount(price,customer));
            System.out.printf("결제 금액: %s\n", (int) bonusPayment.amountPaid(price,customer));
        } else {
            System.out.println("결제 방식: 할인 결제 방식");
            System.out.printf("결제 금액: %s\n", (int) discountPayment.amountPaid(price,customer));
        }
        System.out.println("=========================");

    }
}
