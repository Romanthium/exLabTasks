public class Main {

    public static void main(String[] args) {
        Car car = new Car(new Engine("J5T7S", 5), new FuelTank(30));
        System.out.printf("Fuel level is %d%n", car.checkFuel());
        System.out.printf("Distance is %d%n", car.getTotalDistance());
        car.startEngine();
        car.fillFuel(50);
        car.fillFuel(25);
        car.startCar();
        car.startEngine();
        car.startCar();
        car.stopCar();
        car.startCar();
        car.stopCar();
        car.stopEngine();
        System.out.printf("Distance is %d%n", car.getTotalDistance());
        System.out.printf("Fuel remains %d%n", car.checkFuel());
    }
}
