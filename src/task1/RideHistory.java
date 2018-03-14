package task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergey.kliepikov on 3/14/18.
 */
public class RideHistory {

    private final List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public long getTotalPrice() {
        long totalPrice = 0;
        for (Ride ride : rides) {
            totalPrice += ride.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "RideHistory{" +
                "rides=" + rides +
                '}';
    }
}
