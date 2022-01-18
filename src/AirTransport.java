public class AirTransport extends Transport{
    private double wingspan;
    private int minimumRunwayLength;


    public AirTransport(double powerHP, int speed, double mass, String producer, double wingspan, int minimumRunwayLength) {
        super(powerHP, speed, mass, producer);
        this.wingspan = wingspan;
        this.minimumRunwayLength = minimumRunwayLength;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinimumRunwayLength() {
        return minimumRunwayLength;
    }

    public void setMinimumRunwayLength(int minimumRunwayLength) {
        this.minimumRunwayLength = minimumRunwayLength;
    }
}
