import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
    }

    public void removeProduct(String productName) {
        items.removeIf(item -> item.getProduct().getProductName().equals(productName));
    }

    public double getTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Carrinho de Compras:");
        for (CartItem item : items) {
            System.out.println("Nome do produto: " + item.getProduct().getProductName());
            System.out.println("Preço: R$ " + item.getProduct().getPrice());
            System.out.println("Quantidade: " + item.getQuantity());
            System.out.println("---------------------------");
        }
        System.out.println("Total: " + getTotal());
    }
}
