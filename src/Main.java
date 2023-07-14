import customer.Customer;
import customer.MobileCustomer;
import paymentPolicy.PaymentPolicy;
import service.SaleService;
import customer.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //세일 서비스 객체 생성
        SaleService saleService = new SaleService();

        //고객 객체 생성, equals 테스트
        Customer jake1 = new WebCustomer("jake", Membership.BRONZE, PaymentPolicy.DISCOUNT);
        Customer jake2 = new WebCustomer("jake", Membership.GOLD, PaymentPolicy.DISCOUNT);

        System.out.println("=========================");
        System.out.printf("equals Test: jake1.equals(jake2)? %b\n", jake1.equals(jake2));
        System.out.printf("Same hashcode(jake1.hashCode() == jake2.hashCode())? %b\n",jake1.hashCode() == jake2.hashCode());
        System.out.println("=========================");

        // 고객 리스트 생성 웹: 3명, 모바일: 3명
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new WebCustomer("웹고객1", Membership.BRONZE, PaymentPolicy.DISCOUNT));
        customers.add(new WebCustomer("웹고객2", Membership.SILVER, PaymentPolicy.BONUS));
        customers.add(new WebCustomer("웹고객3", Membership.GOLD, PaymentPolicy.DISCOUNT));
        customers.add(new MobileCustomer("모바일고객1", Membership.BRONZE, PaymentPolicy.BONUS));
        customers.add(new MobileCustomer("모바일고객2", Membership.SILVER, PaymentPolicy.DISCOUNT));
        customers.add(new MobileCustomer("모바일고객3", Membership.GOLD, PaymentPolicy.BONUS));

        // 고객 정보 조회 & 가격 계산
        int price = 10000;
        for(Customer customer: customers){
            saleService.processPayment(price, customer);
            price += 10000;
        }

    }
}