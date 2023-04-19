
//3.    Abstrakt Klasse AFuelCar. Denne klasse skal nedarve fra Acar. Den skal tilføje to metoder:
public abstract class AFuelCar extends ACar {

    //Lav en attribut til at gemme kilometer per liter og initialisér den i konstruktøren.
    int kmPrLitre=0;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber,make,model,numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType(); // return Gas/Dielsel

    public int kmPrLitre(){                // should return how many kilometres the car can drive on 1 litre of fuel

        return kmPrLitre;
    }

@Override
    public  String toString(){
        return super.toString() + "\n kmprliter:" +kmPrLitre();
}

}
