import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class MapLnkDemo2 {
	public static void main(String[] args) {
        // Create a HashSet of Car objects
        Map<String, Car> carMap = new HashMap<>();

        // Add 4 Car objects to the set
        Car honda = new Car("1HGCM82633A123456", "Honda Accord");
        Car toyota = new Car("1HGCM82633A123457", "Toyota Camry");
        Car mustang = new Car("1HGCM82633A123458", "Ford Mustang");
        Car tesla = new Car("1HGCM82633A123459", "Tesla Model S");
        
        carMap.put(toyota.getVin(), toyota);
        carMap.put(mustang.getVin(), mustang);
        carMap.put(honda.getVin(), honda);
        carMap.put(tesla.getVin(), tesla);
        
     // First loop: Using a standard for-each loop to iterate over the entry set (key-value pairs)
        System.out.println("Using for-each loop:");
        for (Map.Entry<String, Car> entry : carMap.entrySet()) {
            String vinNum = entry.getKey();
            Car  car1 = entry.getValue();
            System.out.println("key: " + vinNum + ", VALUE " + car1);
        }

        // Second loop: Using the forEach method with a lambda expression
        System.out.println("\nUsing forEach method:");
        carMap.forEach((key, value) -> {
            System.out.println("key: " + key + ", Value: " + value);
        });
	}
}
