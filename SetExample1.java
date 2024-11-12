import java.util.HashSet;
public class SetExample1 {
	 public static void main(String[] args) {
	        
	        // Create an empty HashSet using the default constructor
	        HashSet<String>  set1 = new HashSet<>();
	        
	        // Adding elements to the defaultSet
	        set1.add("Apple");
	        set1.add("Banana");
	        set1.add("Orange");
	        
	        System.out.println("Elements in set1: " + set1);

	        // Create a HashSet with an initial set of elements
	        HashSet<String> set2 = new HashSet<>(set1);
	        
	        // Adding additional elements to initialSet
	        set2.add("Grapes");
	        set2.add("Pineapple");

	        System.out.println("Elements in set2: " + set2);
	        if (!set2.add("Pineapple"))
	            System.out.println("Pineapple already in the set");   ;
	        
	        
	    }

}
