package Opgave_3;

public class FixedDiscount extends Discount {
    private int fixedDiscount;
    private int discountLimit;

    public FixedDiscount(double price, int fixedDiscount, int discountLimit){
        super.getDiscount(price);
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }

    @Override
    public double getDiscount(double price){
        return super.getDiscount(price);
    }
}
