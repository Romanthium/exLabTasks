public class Car {
    private final Engine engine;
    private final FuelTank fuelTank;

    private String name;
    private int year;

    private int totalDistance;

    public Car(Engine engine, FuelTank fuelTank) {
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public void startEngine() {
        if (!isFuelEnough()) {
            System.out.println("Not enough fuel to start");
        } else {
            System.out.println("Engine has started");
            engine.setIsOn(true);
        }
    }

    public void stopEngine() {
        System.out.println("Engine has stopped");
        engine.setIsOn(false);
    }

    private boolean isFuelEnough() {
        return checkFuel() > 0;
    }

    public int checkFuel() {
        return fuelTank.getFuelRemaining();
    }

    public void fillFuel(int fuelToFill) {
        if (fuelTank.getFuelRemaining() + fuelToFill <= fuelTank.getVolume()) {
            fuelTank.setFuelRemaining(fuelTank.getFuelRemaining() + fuelToFill);
            System.out.printf("The tank is filled, fuel level is %d%n", fuelTank.getFuelRemaining());
        } else {
            System.out.println("Too much fuel for this fuel tank's volume");
        }
    }

    public void startCar() {
        System.out.println(engine.isOn() ? "The car is driving" : "First, start the engine");
    }

    public void stopCar() {
        if (!engine.isOn()) {
            System.out.println("The car was already stopped");
        } else {
            System.out.println("The car has stopped");
            increaseTotalDistance(5);
            consumeFuel(5);
        }
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    private void increaseTotalDistance(int distance) {
        totalDistance += distance;
    }

    private void consumeFuel(int fuelConsumed) {
        fuelTank.setFuelRemaining(fuelTank.getFuelRemaining() - fuelConsumed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
