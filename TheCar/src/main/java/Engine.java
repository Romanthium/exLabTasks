public class Engine {
    private final String vin;
    private final int volume;

    public Engine(String vin, int volume) {
        this.vin = vin;
        this.volume = volume;
    }

    private boolean on;


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getVin() {
        return vin;
    }

    public int getVolume() {
        return volume;
    }
}
