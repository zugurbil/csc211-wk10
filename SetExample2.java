import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample2 {
	  public static void main(String[] args) {

	        // Create a Set using Arrays.asList and HashSet constructor
	        /*
	        The asList() method of java.util.Arrays class is used to return a fixed-size list backed by the 
	        specified array. This method acts as a bridge between array-based and collection-based APIs
	        */
	        Set<String> set = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange", "Grapes"));

	        // Print elements using Iterator
	        System.out.println("Elements in the set:");
	        Iterator<String> iterator = set.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Check for specific elements using contains() method
	        String elementToCheck1 = "Banana";
	        String elementToCheck2 = "Pineapple";

	        if (set.contains(elementToCheck1)){
	             System.out.println("\nThe set contain '" + elementToCheck1);
	        }
	        else {
	             System.out.println("\nThe set DOES NOT contain '" + elementToCheck1);
	        }
	             
	        if (set.contains(elementToCheck2)){
	             System.out.println("\nThe set contain '" + elementToCheck2);
	        }
	        else {
	             System.out.println("\nThe set DOES NOT contain '" + elementToCheck2);
	        }
	        System.out.println("\nDoes the set contain '" + elementToCheck1 + "'? " + set.contains(elementToCheck1));
	        System.out.println("Does the set contain '" + elementToCheck2 + "'? " + set.contains(elementToCheck2));
	        set.remove(elementToCheck1);
	        set.add(elementToCheck1);
	  }

}
