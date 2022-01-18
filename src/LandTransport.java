public class LandTransport extends Transport{
    private int numberOfWeels;
    private int fuelСonsumption;

    public LandTransport(double powerHP, int speed, double mass, String producer, int numberOfWeels, int fuelСonsumption) {
        super(powerHP, speed, mass, producer);
        this.numberOfWeels = numberOfWeels;
        this.fuelСonsumption = fuelСonsumption;
    }

    public int getNumberOfWeels() {
        return numberOfWeels;
    }

    public void setNumberOfWeels(int numberOfWeels) {
        this.numberOfWeels = numberOfWeels;
    }

    public int getFuelСonsumption() {
        return fuelСonsumption;
    }

    public void setFuelСonsumption(int fuelСonsumption) {
        this.fuelСonsumption = fuelСonsumption;
    }
}
