import java.util.ArrayList;

//Der skal en klasse FleetOfCars, der indeholder en ArrayList<Car>, der kan indeholde alle bilerne, som udlejningsfirmaet råder over.
public class FleetOfCars {
    public ArrayList<Car> cars;

    public FleetOfCars() {
        this.cars = new ArrayList<>();
    }

    //     Klassen skal indeholde en metode til at tilføje en bil til flåden.
    public void addCar(Car car) {
        cars.add(car);
    }

    //Den skal overskrive toString(), så den returnerer en String, der lister alle bilerne i flåden.
    @Override
    public String toString() {
        String s = "Cars in fleet: \n";
        Car c;
        for (int i = 0; i < cars.size(); i++) {
            c = cars.get(i);
            s = s + c.toString() + "\n";
        }
        return s;
    }


    // beregner den samlede registreringsafgift for hele bilflåden.
    public int getTotalRegistrationFeeForFleet() {
        int sum = 0;
        Car car;
        for (int i = 0; i < cars.size(); i++) {
            car = cars.get(i);
            sum = sum + car.getRegistrationFee();
        }
        return sum;
    }



}




