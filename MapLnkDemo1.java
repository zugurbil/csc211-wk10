import java.util.LinkedHashMap;
import java.util.Map;

public class MapLnkDemo1 {
    public static void main(String[] args) {
        // Create a LinkedHashMap to store customerId (Integer) and customerName (String)
        Map<Integer, String> customerMap = new LinkedHashMap<>();

        // Add 5 elements to the map
        customerMap.put(1, "Alice Johnson");
        customerMap.put(2, "Bob Smith");
        customerMap.put(3, "Charlie Brown");
        customerMap.put(4, "Diana Prince");
        customerMap.put(5, "Evan Davis");

        // First loop: Using a standard for-each loop to iterate over the entry set (key-value pairs)
        System.out.println("Using for-each loop:");
        for (Map.Entry<Integer, String> entry : customerMap.entrySet()) {
            Integer customerId = entry.getKey();
            String customerName = entry.getValue();
            System.out.println("Customer ID: " + customerId + ", Customer Name: " + customerName);
        }

        // Second loop: Using the forEach method with a lambda expression
        System.out.println("\nUsing forEach method:");
        customerMap.forEach((customerId, customerName) -> {
            System.out.println("Customer ID: " + customerId + ", Customer Name: " + customerName);
        });
    }
}
