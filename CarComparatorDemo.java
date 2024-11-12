import java.util.Set;
import java.util.TreeSet;


public class CarComparatorDemo {
	public static void main(String[] args) {
        // Create a TreeSet with CarComparator to sort by vin
        Set<Car> carSet = new TreeSet<>(new CarComparator());

        // Add 4 Car objects to the set
        carSet.add(new Car("1HGCM82633A123456", "Honda Accord"));
        carSet.add(new Car("1HGCM82633A123459", "Toyota Camry"));
        carSet.add(new Car("1HGCM82633A123458", "Ford Mustang"));
        carSet.add(new Car("1HGCM82633A123457", "Tesla Model S"));

        // Display elements in the TreeSet, sorted by vin
        System.out.println("Cars in the TreeSet (ordered by VIN):");
        for (Car car : carSet) {
            System.out.println(car);
        }
    }
}
