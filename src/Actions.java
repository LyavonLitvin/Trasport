public interface Actions {
    void printData();
    void mainInfo();
    default double powerСalculation (double powerHP){

        double powerKW = 0.74 * powerHP;
        return powerKW;
    }
}
