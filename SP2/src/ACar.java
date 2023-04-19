
//2.    Abstrakt klasse ACar. Skal implementere Car interfacet og alle metoderne i dette, undtagen getRegistrationFee(). Lav klasse attributter til at holde styr på registreringsnummer (nummerplade), mærke, model og antal døre. (Husk at bruge engelske navne til alt). Overvej hvilke attributter det giver mening at lave final.

public abstract class ACar implements Car {

 String RegistrationNumber = "";

    private String make= "";

    private String model = "";

    private int numberOfDoors = 0;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        RegistrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationNumber() {

        return RegistrationNumber;
    }


    public String getMake() {

        return make;
    }


    public String getModel() {

        return model;
    }

    public int numberOfDoors() {
        return numberOfDoors;
    }

  //Du kan evt. overskrive toString() i Acar klassen, så den returnerer en String med de attributter, der er fælles for alle biler og overskrive toString() i FuelCar klassen så den bruger super klassens toString() og tilføjer km/l

    @Override
    public String toString(){

        return  " \n Make:" + getMake()+ "\n Model:"+getModel() + "\n RegistrationNumber:" + getRegistrationNumber()+" \n numberOfDoors:" + numberOfDoors();

    }



}
