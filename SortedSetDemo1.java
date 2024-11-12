import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo1 {
	public static void main(String[] args) {

        // Initialize elements using Arrays.asList
        Set<String> elements = new LinkedHashSet<>(Arrays.asList("Apple", "Banana", "Orange", "Grapes"));

        // Create a LinkedHashSet (preserves insertion order)
        Set<String> linkedHashSet = new LinkedHashSet<>(elements);
        
        // Create a HashSet (no guaranteed order)
        Set<String> hashSet = new HashSet<>(elements);

        // Create a TreeSet (automatically sorted)
        SortedSet<String> treeSet = new TreeSet<>(elements);

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

        // Print elements of TreeSet
        System.out.println("\nElements in TreeSet (Sorted Order):");
        for (String item : treeSet) {
            System.out.println(item);
        }

        // Use first() and last() on the SortedSet (TreeSet)
        System.out.println("\nFirst element in TreeSet: " + treeSet.first());
        System.out.println("Last element in TreeSet: " + treeSet.last());
    }
}
