package XIVokt;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        var cars = List.of(
                new Car("Peugeot", "206", "White", 75, "Diesel", "Manual", "2002"),
                new Car("BMW", "320i", "Black", 150, "Petrol", "Automatic", "2010"),
                new Car("Audi", "A4", "Red", 140, "Diesel", "Manual", "2015"),
                new Car("Peugeot", "307", "Blue", 90, "Diesel", "Manual", "2005"),
                new Car("BMW", "X5", "Silver", 230, "Diesel", "Automatic", "2020"),
                new Car("BMW", "X5", "Silver", 230, "Diesel", "Automatic", "2020"),
                new Car("BMW", "X5", "Silver", 230, "Diesel", "Automatic", "2020"),
                new Car("BMW", "X5", "Silver", 230, "Diesel", "Automatic", "2020"),
                new Car("BMW", "X5", "Silver", 230, "Diesel", "Automatic", "2020"),
                new Car("BMW", "X5", "Silver", 230, "Diesel", "Automatic", "2020")
        );
        System.out.println(CarService.sortCarsByFirstCharacter(cars, 'P'));
        System.out.println(CarService.sortCarsByOrder(cars, true));
        System.out.println(CarService.sortCarsByOrder(cars, false));
        System.out.println(CarService.getCarsWithSameBrandAndModel(cars));
    }
}
