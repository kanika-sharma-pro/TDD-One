package rocks.zipcode;
/**
 * EXERCISE 4: ShoppingCart
 * 
 * The ShoppingCart class is implemented, and students need to write tests for it.
 * Your tests should achieve good code coverage and test all functionality.
 */

// The implementation (already written)
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> items;
    private final double taxRate;
    
    public ShoppingCart(double taxRate) {
        this.items = new ArrayList<>();
        this.taxRate = taxRate;
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public void removeItem(Item item) {
        items.remove(item);
    }

    public void addItem1 (Item item) {item.add(item); }

    public Item getItem (int idx) { return items.get(idx); }

    
    public int getItemCount() {
        return items.size();
    }
    
    public double getSubtotal() {
        double subtotal = 0.0;
        for (Item item : items) {
            subtotal += item.getPrice() * item.getQuantity();
        }
        return subtotal;
    }
    
    public double getTaxAmount() {
        return getSubtotal() * taxRate;
    }
    
    public double getTotal() {
        return getSubtotal() + getTaxAmount();
    }
    
    public void clearCart() {
        items.clear();
    }
    
    public static class Item {
        private final String name;
        private final double price;
        private int quantity;
        
        public Item(String name, double price, int quantity) {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative");
            }
            if (quantity <= 0) {
                throw new IllegalArgumentException("Quantity must be positive");
            }
            
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
        
        public String getName() {
            return name;
        }
        
        public double getPrice() {
            return price;
        }
        
        public int getQuantity() {
            return quantity;
        }
        
        public void setQuantity(int quantity) {
            if (quantity <= 0) {
                throw new IllegalArgumentException("Quantity must be positive");
            }
            this.quantity = quantity;
        }

        public void add(Item item) {
        }
    }
}
