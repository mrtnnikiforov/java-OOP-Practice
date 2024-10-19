package XVIIokt;

public class Car {
    private String brand;
    private int speed;
    private double fuel;
    private int mileage;

    public void accelerate(int amountIncreased) {
        if (speed + amountIncreased <= 0) {
            this.speed = 0;
            System.out.println("The car has stopped.");
        } else {
            this.speed += amountIncreased;
            System.out.printf("You are now driving with %d km/h.", speed);
        }
    }

    public void refuel(double amount){
        if (amount < 0){
            throw new RuntimeException("You cannot take out fuel from the car!\n");
        }
        this.fuel += amount;
        System.out.printf("You added %f liters of fuel, and now have %f liters in total.\n", amount, fuel);
    }

    public void drive(int distance){
        if (fuel - distance < 0){
            throw new RuntimeException("You don't have enough fuel to make this trip.\n");
        }
        mileage += distance;
        fuel -= distance;
        System.out.printf("You drove %d kilometers. Current mileage: %d. Level of fuel: %f\n", distance, mileage, fuel);
    }

    public Car(String brand, int speed, double fuel, int mileage) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
