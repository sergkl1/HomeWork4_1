package task1;

/**
 * Created by sergey.kliepikov on 3/14/18.
 */
public class StandardTariff implements Tariff{

    @Override
    public long calculatePrice(Ride ride) {
        return 30 + 5 * ride.getDistance() + 2 * ride.getDuration();
    }
}
