package Opgave_3;

public class PercentDiscount extends Discount {
    private int discountPercentage;

    public PercentDiscount(double price, int discountPercentage){
        super.getDiscount(price);
        this.discountPercentage = discountPercentage;
}

    @Override
    public double getDiscount(double price){
//        this.discountPercentage = discountPercentage;
//        super.getDiscount(price);
        return super.getDiscount(price);
    }
}
