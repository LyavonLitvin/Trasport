import java.util.Scanner;

public class WarAirTransport extends AirTransport implements Actions{
    private boolean systemCatapulting;
    private int quantityRocket;

    public WarAirTransport(double powerHP, int speed, double mass, String producer, double wingspan, int minimumRunwayLength, boolean systemCatapulting, int quantityRocket) {
        super(powerHP, speed, mass, producer, wingspan, minimumRunwayLength);
        this.systemCatapulting = systemCatapulting;
        this.quantityRocket = quantityRocket;
    }

    public boolean isSystemCatapulting() {
        return systemCatapulting;
    }

    public void setSystemCatapulting(boolean systemCatapulting) {
        this.systemCatapulting = systemCatapulting;
    }

    public int getQuantityRocket() {
        return quantityRocket;
    }

    public void setQuantityRocket(int quantityRocket) {
        this.quantityRocket = quantityRocket;
    }

    public void mainInfo() {

        double powerKW = powerСalculation(getPowerHP());
        System.out.println("Военный самолет: мощность двигателя " + getPowerHP() + " л.с. ( " + powerKW + " кВт ), максимальная скорость " + getSpeed() + " км/ч, масса "+ getMass() + " тонн(ы), производитель " + getProducer() + " , размах крыльев (м) " + getWingspan() + ", минимальная длина взлётно-посадочной полосы для взлёта (м) " + getMinimumRunwayLength() + ", наличие системы катапультирования " + this.systemCatapulting + ", количество ракет " + this.quantityRocket);
    }

    @Override
    public void printData() {
        if (quantityRocket > 0)
            System.out.println("Ракета пошла");
        else System.out.println("Боеприпасы отсутсвуют");

    }

    public void catapulting() {
        if (systemCatapulting)
            System.out.println("Катапульторование прошло успешно");
        else System.out.println("У вамс нет такой системы");
        return;
    }
}
