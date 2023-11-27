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

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (CartItem item : items) {
            System.out.println("Product ID: " + item.getProductId());
            System.out.println("Product Name: " + item.getProductName());
            System.out.println("Price: $" + item.getPrice());
            System.out.println("---------------------------");
        }
        System.out.println("Total Items: " + quantity);
    }
}
