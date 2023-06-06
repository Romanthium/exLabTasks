public class Engine {
    private final String vin;
    private final int volume;

    public Engine(String vin, int volume) {
        this.vin = vin;
        this.volume = volume;
    }

    private boolean isOn;


    public boolean isOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public String getVin() {
        return vin;
    }

    public int getVolume() {
        return volume;
    }
}
