//  question 13(oops assignment 5)

import java.util.*;

public class Item {
    private String code;
    private double price;
    
    public Item(String code, double price) {
        this.code = code;
        this.price = price;
    }
    
    public String getCode() {
        return code;
    }
    
    public double getPrice() {
        return price;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to hold five Item objects
        Item[] items = new Item[5];
        
        // Accept data for five objects
        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter details for item " + (i + 1) + ":");
            System.out.print("Code: ");
            String code = scanner.next();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            items[i] = new Item(code, price);
        }
        
        // Display code and price in tabular form
        System.out.println("\nCode\tPrice");
        for (Item item : items) {
            System.out.println(item.getCode() + "\t" + item.getPrice());
        }
        
        // Calculate and display total price of all items
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        System.out.println("\nTotal Price of all items: " + totalPrice);
        
        scanner.close();
    }
}
