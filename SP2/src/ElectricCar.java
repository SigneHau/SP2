public class ElectricCar extends ACar{

    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model,numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    private int getBatteryCapacityKWh() {

        return batteryCapacity; // "the battery capacity in kilowatt hours"

    }
    private int getMaxRangeKm(){
       return maxRange;  // returns the maximum range in kilometres.

    }

    private int getWhPrKm() // returns the power consumption in watt hours per driven kilometre.
    {
        return (batteryCapacity*1000)/maxRange;
    }


    public int getRegistrationFee(){

        // blot skal man først omregne watt-timer pr kilometer til km/l.
        double kmPrLitre = getWhPrKm() / 91.25 / 100;


        if (kmPrLitre <= 5) {
            return 10470;
        }

        if(kmPrLitre > 5 && kmPrLitre<=10){
            return 5500;
        }

        if(kmPrLitre > 10 && kmPrLitre <= 15) {
            return 2340;
        }

        if(kmPrLitre > 15 && kmPrLitre <= 20) {
            return 1050;
        }

        if(kmPrLitre > 20 && kmPrLitre <= 50) {
            return 330;
        }
        else return 0;
    }

    @Override
    public String toString(){

        return super.toString() + "\n Fueltype:Electric"+ "\n RegistrationFee:"+ getRegistrationFee() ;

    }

}
