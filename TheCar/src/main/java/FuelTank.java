public class FuelTank {
    private final int volume;

    private int fuelRemaining;

    public FuelTank(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int getFuelRemaining() {
        return fuelRemaining;
    }

    public void setFuelRemaining(int fuelRemaining) {
        this.fuelRemaining = fuelRemaining;
    }
}
