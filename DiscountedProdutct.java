public class DiscountedProduct {
    private double discountRate;

    // Construtor
    public DiscountedProduct(double discountRate) {
        this.discountRate = discountRate;
    }

    // Método getter para obter o valor do desconto
    public double getDiscountRate() {
        return discountRate;
    }

    // Método setter para definir o valor do desconto
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }