package customer;

public enum Membership {
    BRONZE(0.1),
    SILVER(0.2),
    GOLD(0.3);

    private final double discountRate;
    Membership(double discountRate){
        this.discountRate = discountRate;
    }
    public double getDiscountRate(){
        return discountRate;
    }
}
