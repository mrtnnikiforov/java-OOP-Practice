package XIVokt;

import java.util.Comparator;
import java.util.List;

public class CarService {
    public static List<Car> sortCarsByFirstCharacter(List<Car> cars, char letter){
        return cars.stream()
                .filter(car -> car.getBrand().startsWith(String.valueOf(letter)))
                .toList();
    }

    public static List<Car> sortCarsByOrder(List<Car> cars, boolean isAscending){
        if (isAscending){
            return cars.stream()
                    .sorted(Comparator.comparing(Car::getBrand))
                    .toList();
        }
        return cars.stream()
                .sorted(Comparator.comparing(Car::getBrand).reversed())
                .toList();
    }

    public static List<Car> getCarsWithSameBrandAndModel(List<Car> cars) {
        return cars.stream()
                .distinct()
                .toList();
    }
}
