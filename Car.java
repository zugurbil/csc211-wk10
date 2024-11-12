import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Car {
    private String vin;
    private String description;

    // Constructor with two parameters
    public Car(String vin, String description) {
        this.vin = vin;
        this.description = description;
    }

    // Getter for vin
    public String getVin() {
        return vin;
    }

    // Setter for vin
    public void setVin(String vin) {
        this.vin = vin;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    // Override equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(vin, car.vin) &&
               Objects.equals(description, car.description);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
    	System.out.println("hascode function");
       // return vin.hashCode();
        return Objects.hash(vin, description);
    }

    public static void main(String[] args) {
        // Create a HashSet of Car objects
        Set<Car> carSet = new HashSet<>();

        // Add 4 Car objects to the set
        carSet.add(new Car("1HGCM82633A123456", "Honda Accord"));
        carSet.add(new Car("1HGCM82633A123457", "Toyota Camry"));
        carSet.add(new Car("1HGCM82633A123458", "Ford Mustang"));
        carSet.add(new Car("1HGCM82633A123459", "Tesla Model S"));

        // Display elements in the set
        System.out.println("Cars in the set:");
        for (Car car : carSet) {
            System.out.println(car);
        }

        // Search for a car in the set
        Car searchCar = new Car("1HGCM82633A123456", "Honda Accord");
        System.out.println("\nIs the car in the set? " + carSet.contains(searchCar));
    }
}
