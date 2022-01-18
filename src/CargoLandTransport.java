import java.util.Scanner;

public class CargoLandTransport extends LandTransport implements Actions{
    private double carryingCapacity;

    public CargoLandTransport(double powerHP, int speed, double mass, String producer, int numberOfWheels, int fuelConsumption, double carryingCapacity) {
        super(powerHP, speed, mass, producer, numberOfWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public void mainInfo() {

        double powerKW = powerСalculation(getPowerHP());
        System.out.println("Грузовой автомобиль: мощность двигателя " + getPowerHP() + " л.с. ( " + powerKW + " кВт ), максимальная скорость " + getSpeed() + " км/ч, масса "+ getMass() + " тонн(ы), производитель " + getProducer() + " , расход топлива на 100км " + getFuelСonsumption() + " литров, грузоподъемностью " + this.carryingCapacity + " тонн(ы)");
    }

    @Override
    public void printData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько необхожимо загрузить в грузовик (тонн)");
        double cargo = scanner.nextInt();
        if (cargo <= carryingCapacity)
        System.out.println("Грузовик загружен");
        else System.out.println("Вам нужен грузовик побольше");
    }
}
