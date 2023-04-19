
//Skriv en main-metode der instantierer et FleetOfCars-objekt og et antal bil-objekter af de 3 konkrete typer.

public class Main {

    public static void main(String[] args) {

        FleetOfCars signesFleet = new FleetOfCars();


     Car car1 = new GasolineCar("BZ5245","BMW","Gran",5,17);
     Car car2 = new DieselCar("AN7445","Audi","A4 Avent",5,15);
     Car car3 = new ElectricCar("GB3645","Tesla","Model 3",5,200,542);
     Car car4 = new ElectricCar("FH4445","Kia","Totuk",5,80,520);


     signesFleet.addCar(car1);
     signesFleet.addCar(car2);
     signesFleet.addCar(car3);
     signesFleet.addCar(car4);


        System.out.println(signesFleet);

        System.out.println("Total registration fee for fleet:" + signesFleet.getTotalRegistrationFeeForFleet());

    }
}