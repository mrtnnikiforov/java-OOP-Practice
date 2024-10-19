package XVIIokt;

public class ElectricCar extends Car {
    private int batteryLevel;
    private final int efficiency;

    public ElectricCar(String brand, int speed, double fuel, int mileage, int batteryLevel, int efficiency) {
        super(brand, speed, fuel, mileage);
        this.batteryLevel = batteryLevel;
        this.efficiency = efficiency;
    }

    public void charge(int amount) {
        var newAmount = batteryLevel + amount;
        if (newAmount < 0 || newAmount > 100) {
            throw new RuntimeException("Invalid battery after charging.");
        }
        System.out.printf("You now have %d%% battery.", batteryLevel);
    }

    public void driveElectric(int distance) {
        if (batteryLevel - (distance / efficiency) < 0) {
            throw new RuntimeException("You don't have enough battery to make this trip.\n");
        }
        setMileage(getMileage() + distance);
        batteryLevel -= distance / efficiency;
        System.out.printf("You drove %d kilometers. Current mileage: %d. Level of battery: %d\n", distance, getMileage(), batteryLevel);
    }
}
