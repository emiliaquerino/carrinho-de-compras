public class CartItem {
    private Product product; //product é uma instância da classe Product
    private int quantity; //quantity é um inteiro que irá representar a quantidade

    // método construtor (Que irá receber o médoto Product e o inteiro quantity )

    public CartItem(Product product, int quantity) {
        this.product = product; 
        this.quantity = quantity;
    }

    // Adicionando os métodos getters e setters ao código
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}