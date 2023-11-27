import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CartItem {
    private int productId;
    private String productName;
    private double price;

    // Construtor, getters e setters omitidos para simplificar
}

public class ShoppingCart {
    private List<CartItem> items;
    private int quantity;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.quantity = 0;
    }

    public void addItem(CartItem item) { //adiocionar item
        items.add(item);
        quantity += 1;
    }

    public void removeItem(int productId) {
        Iterator<CartItem> iterator = items.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.getProductId() == productId) {
                iterator.remove();
                quantity -= 1;
                break;
            }
        }
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
