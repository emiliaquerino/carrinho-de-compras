import java.util.Scanner;

public class CartManager {
    private ShoppingCart cart;
    private Scanner scanner;

    public CartManager(ShoppingCart cart) {
        this.cart = cart;
        this.scanner = new Scanner(System.in);
    }

    public void addProduct() {
        System.out.println("Informe o nome do produto:");
        String name = scanner.next();

        System.out.println("Informe o preço do produto:");
        double price = scanner.nextDouble();

        System.out.println("Informe a quantidade:");
        int quantity = scanner.nextInt();

        Product product = new Product(name, price);

        System.out.println("É um produto com desconto? (s/n)");
        String isDiscounted = scanner.next();

        if ("s".equalsIgnoreCase(isDiscounted)) {
            System.out.println("Informe o desconto (ex., 0,20 para 20%):");
            double discountRate = scanner.nextDouble();
            DiscountedProduct discountedProduct = new DiscountedProduct(name, price, discountRate);
            cart.addProduct(discountedProduct, quantity);
        } else {
            cart.addProduct(product, quantity);
        }
    }

    public void removeProduct() {
        System.out.println("Informe o nome do produto para remover:");
        String productName = scanner.next();
        cart.removeProduct(productName);
    }
}