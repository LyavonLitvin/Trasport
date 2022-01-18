import java.util.Scanner;

public class PersonalLandTransport extends LandTransport implements Actions{
    private String bodyType;
    private int numberPassengers;
    private double time;

    public PersonalLandTransport(double powerHP, int speed, double mass, String producer, int numberOfWheels, int fuelConsumption, String bodyType, int numberPassengers) {
        super(powerHP, speed, mass, producer, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberPassengers = numberPassengers;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }


    private double quantityFuel(double time){
        return ( time * getSpeed() ) / getFuelСonsumption();
    }


    public void mainInfo() {

        double powerKW = powerСalculation(getPowerHP());
        System.out.println("Легковой автомобиль: мощность двигателя " + getPowerHP() + " л.с. ( " + powerKW + " кВт ), максимальная скорость " + getSpeed() + " км/ч, масса "+ getMass() + " тонн(ы), производитель " + getProducer() + " , расход топлива на 100км " + getFuelСonsumption() + " литров, тип кузова " + this.bodyType + ", число пасажиров " + this.numberPassengers);
    }

    @Override
    public void printData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько будет ехать машина");
        time = scanner.nextInt();
        System.out.println("За время " + time + "ч, автомобиль " + getProducer() + " двигаясь с максимальной скоростью " + getSpeed() + " км/ч проедет " + time * getSpeed() + " км и израсходует " + quantityFuel(time) + " литров топлива");
    }

}
