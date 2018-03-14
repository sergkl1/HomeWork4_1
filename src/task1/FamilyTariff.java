package task1;

/**
 * Created by sergey.kliepikov on 3/14/18.
 */
public class FamilyTariff implements Tariff {

    @Override
    public long calculatePrice(Ride ride) {
        return 50 + 20 * ride.getDistance() / ride.getPassengers();
    }
}
