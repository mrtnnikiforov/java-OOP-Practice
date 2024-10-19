package lab2;

import java.util.*;

public class Car {
    private String brand;
    private String model;
    private String colour;
    private int horsePower;
    private String engineType;
    private String gearboxType;
    private String yearManufactured;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getYearManufactured() {
        return yearManufactured;
    }

    public void setYearManufactured(String yearManufactured) {
        this.yearManufactured = yearManufactured;
    }

    public Car(String brand, String model, String colour, int horsePower, String engineType, String gearboxType, String yearManufactured) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.horsePower = horsePower;
        this.engineType = engineType;
        this.gearboxType = gearboxType;
        this.yearManufactured = yearManufactured;
    }

    Car() {
        brand = "Peugeot";
        model = "206";
        colour = "White";
        horsePower = 75;
        engineType = "Diesel";
        gearboxType = "Manual";
        yearManufactured = "2002";
    }

    public static Car[] filterByBrandLetter(Car[] cars, char letter) {
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBrand().charAt(0) == letter) {
                count++;
            }
        }

        Car[] filteredCars = new Car[count];
        int index = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBrand().charAt(0) == letter) {
                filteredCars[index++] = cars[i];
            }
        }

        return filteredCars;
    }


    public static Car[] sortByBrand(Car[] cars, boolean ascending) {
        Arrays.sort(cars, (c1, c2) -> ascending
                ? c1.getBrand().compareTo(c2.getBrand())
                : c2.getBrand().compareTo(c1.getBrand()));
        return cars;
    }

    public static Car[] removeDuplicates(Car[] cars) {
        int n = cars.length;
        Car[] uniqueCars = new Car[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (cars[i].getBrand().equals(uniqueCars[j].getBrand()) &&
                        cars[i].getModel().equals(uniqueCars[j].getModel()) &&
                        cars[i].getYearManufactured().equals(uniqueCars[j].getYearManufactured())) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueCars[uniqueCount] = cars[i];
                uniqueCount++;
            }
        }

        Car[] result = new Car[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueCars[i];
        }

        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", horsePower=" + horsePower +
                ", engineType='" + engineType + '\'' +
                ", gearboxType='" + gearboxType + '\'' +
                ", yearManufactured='" + yearManufactured + '\'' +
                '}';
    }
}
