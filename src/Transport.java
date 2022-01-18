public class Transport {
    private double powerHP;
    private int speed;
    private double mass;
    private String producer;

    public Transport(double powerHP, int speed, double mass, String producer) {
        this.powerHP = powerHP;
        this.speed = speed;
        this.mass = mass;
        this.producer = producer;
    }

    public double getPowerHP() {
        return powerHP;
    }

    public void setPowerHP(double powerHP) {
        this.powerHP = powerHP;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
