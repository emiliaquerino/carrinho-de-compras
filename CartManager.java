import java.util.Scanner;

public class CartManager {
    private Scanner scanner;

    public CartManager() {
        this.scanner = new Scanner(System.in);
    }

    public void addProduct() {
        System.out.println("Informe o nome do produto:");
        String name = scanner.next();

        System.out.println("Informe o preço do produto:");
        double price = scanner.nextDouble();

        System.out.println("É um produto com desconto? (sim/não)");
        String isDiscounted = scanner.next();

        if ("sim".equalsIgnoreCase(isDiscounted)) {
            System.out.println("Informe o desconto (ex., 0.20 para 20%):");
            double discountRate = scanner.nextDouble();
        }
    }

    public void removeProduct() {
        System.out.println("Informe o nome do produto para remover:");
        String productName = scanner.next();
    }
}
