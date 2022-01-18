public class Main {
    public static void main(String[] args) {
        PersonalLandTransport personalLandTransport1 = new PersonalLandTransport(75,180,1.5,"Skoda",4,7,"Sedan",5);
        PersonalLandTransport personalLandTransport2 = new PersonalLandTransport(101,150,2.0,"Fiat",4,10,"Minivan",7);
        CargoLandTransport cargoLandTransport1 = new CargoLandTransport(150,130,3,"Renault",6,12,3.5);
        CargoLandTransport cargoLandTransport2 = new CargoLandTransport(210,120,5,"Renault",8,12,15.3);
        PasengersAirTransport passengersAirTransport1 = new PasengersAirTransport(6000,870,72.56,"Irkut",35.9,1200,165,true);
        PasengersAirTransport passengersAirTransport2 = new PasengersAirTransport(3220,830,42.00,"Mitsubishi",27.8,900,84,false);
        WarAirTransport warAirTransport1 = new WarAirTransport(2100,2450,15.18,"МиГ",11.36,850,true,6);
        WarAirTransport warAirTransport2 = new WarAirTransport(950,575,3.36,"ЛаГГ",9.8,435,false,0);


        personalLandTransport1.mainInfo();
        personalLandTransport1.printData();
        personalLandTransport2.mainInfo();
        personalLandTransport2.printData();
        cargoLandTransport1.mainInfo();
        cargoLandTransport1.printData();
        cargoLandTransport2.mainInfo();
        cargoLandTransport2.printData();
        passengersAirTransport1.mainInfo();
        passengersAirTransport1.printData();
        passengersAirTransport2.mainInfo();
        passengersAirTransport2.printData();
        warAirTransport1.mainInfo();
        warAirTransport1.printData();
        warAirTransport1.catapulting();
        warAirTransport2.mainInfo();
        warAirTransport2.printData();
        warAirTransport2.catapulting();

    }
}
