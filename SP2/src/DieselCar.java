//5.    Klasse DieselCar. Denne klasse nedarver også fra FuelCar og skal også implementere de to abstrakte metoder getFuelType() og getRegistrationFee(). Herudover skal der være en metode, hasParticleFilter(), der fortæller om bilen har et partikelfilter monteret. Registreringsafgiften skal beregnes ud fra beskrivelsen i toppen af opgaven.

public class DieselCar extends AFuelCar{

    private boolean hasParticleFilter = false;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre ) {
        super(registrationNumber,make,model,numberOfDoors,kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
    int fee =0;
        if (kmPrLitre <= 5) {
            fee = 10470 + 15260;
        }

        if(kmPrLitre > 5 && kmPrLitre<=10){
            fee = 5500 + 2770;
        }

        if(kmPrLitre > 10 && kmPrLitre <= 15) {
            fee = 2340+1850;
        }

        if(kmPrLitre > 15 && kmPrLitre <= 20) {
            fee =1050 + 1390;
        }

        if(kmPrLitre > 20 && kmPrLitre <= 50) {
            fee = 330+130;
        }

        if(hasParticleFilter == false){
            fee=fee+1000;
        }

        return fee;
    }

    public boolean hasParticleFilter(){
        return true;
    }

    @Override
    public String toString(){

        return super.toString() + "\n Fueltype:" + getFuelType()+ "\n RegistrationFee:"+ getRegistrationFee();

    }

}
