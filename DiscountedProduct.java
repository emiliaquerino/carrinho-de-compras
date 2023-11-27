public class DiscountedProduct extends Product {
    private double discountRate;

    public DiscountedProduct(String name, double price, double discountRate) {
        super(name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * (1 - discountRate);
    }
}