//Klasse GasolineCar. Denne klasse nedarver fra FuelCar og skal implementere de to abstrakte metoder getFuelType() og getRegistrationFee(). Registreringsafgiften skal beregnes ud fra beskrivelsen i toppen af opgaven.
public class GasolineCar extends AFuelCar {
     public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre ) {

         super(registrationNumber,make,model,numberOfDoors,kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "Gasolin";
    }


    @Override
    public int getRegistrationFee() {

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

     return super.toString() + "\n Fueltype:" + getFuelType()+ "\n RegistrationFee:"+ getRegistrationFee();

    }



}


