import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
	/*
	 *  Implements Comparator<Car> to compare Car objects by vin.
	 */
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getVin().compareTo(car2.getVin());
    }
}