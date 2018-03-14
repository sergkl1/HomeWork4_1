package task1;

/**
 * Created by sergey.kliepikov on 3/14/18.
 */
public class TaxiRunner {

    public static void main(String[] args) {
        Ride ride1 = new Ride(2, 15, 30, new StandardTariff());
        Ride ride2 = new Ride(4, 40, 60, new FamilyTariff());

        RideHistory history = new RideHistory();
        history.addRide(ride1);
        history.addRide(ride2);

        System.out.println("Total price for different tariffs rides: " + history.getTotalPrice());
    }
}
