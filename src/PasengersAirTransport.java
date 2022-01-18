import java.util.Scanner;

public class PasengersAirTransport extends AirTransport implements Actions{
    private int qantityPasengers;
    private boolean bisnessClass;

    public PasengersAirTransport(double powerHP, int speed, double mass, String producer, double wingspan, int minimumRunwayLength, int qantityPasengers, boolean bisnessClass) {
        super(powerHP, speed, mass, producer, wingspan, minimumRunwayLength);
        this.qantityPasengers = qantityPasengers;
        this.bisnessClass = bisnessClass;
    }

    public int getQantityPasengers() {
        return qantityPasengers;
    }

    public void setQantityPasengers(int qantityPasengers) {
        this.qantityPasengers = qantityPasengers;
    }

    public boolean isBisnessClass() {
        return bisnessClass;
    }

    public void setBisnessClass(boolean bisnessClass) {
        this.bisnessClass = bisnessClass;
    }

    public void mainInfo() {

        double powerKW = powerСalculation(getPowerHP());
        System.out.println("Пассажирский самолет: мощность двигателя " + getPowerHP() + " л.с. ( " + powerKW + " кВт ), максимальная скорость " + getSpeed() + " км/ч, масса "+ getMass() + " тонн(ы), производитель " + getProducer() + " , размах крыльев (м) " + getWingspan() + ", минимальная длина взлётно-посадочной полосы для взлёта (м) " + getMinimumRunwayLength() + ", число пасажиров " + this.qantityPasengers + ", наличие бизнесс-класса " + this.bisnessClass);
    }

    @Override
    public void printData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько пасажиров необходимо разместить в в самолете (чел)");
        int cargo = scanner.nextInt();
        if (cargo <= qantityPasengers)
            System.out.println("Самолет загружен");
        else System.out.println("Вам нужен самолет побольше");
    }
}
