import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSet1 {
	 public static void main(String[] args) {

	        // Create a LinkedHashSet using Arrays.asList to maintain insertion order
	        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("Apple", "Banana", "Orange", "Grapes"));
	        
	        // Create a HashSet using the same elements from Arrays.asList (no guaranteed order)
	        Set<String> hashSet = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange", "Grapes"));

	        // Print elements of LinkedHashSet
	        System.out.println("Elements in LinkedHashSet (Insertion Order Preserved):");
	        for (String item : linkedHashSet) {
	            System.out.println(item);
	        }

	        // Print elements of HashSet
	        System.out.println("\nElements in HashSet (No Specific Order):");
	        for (String item : hashSet) {
	            System.out.println(item);
	        }
	    }
}
