
// 1. Interface Car. Skal have følgende metoder:

public interface Car {



    //a The number on the number plate
    public String getRegistrationNumber();

    //b The make of the car e.g. Audi
    public String getMake() ;

    //c  The model of the car e.g. A6
    public String getModel();

    //d The number of doors
   public  int numberOfDoors();


    //e  Calculates the registration fee for the car
    public int getRegistrationFee();
}
