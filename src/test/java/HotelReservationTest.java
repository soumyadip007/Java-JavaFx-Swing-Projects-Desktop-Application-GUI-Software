import org.junit.Test;

import static org.junit.Assert.*;

public class HotelReservationTest {

    @Test
    public void testReservationSuccess() {
        HotelReservation reservation = new HotelReservation();
        boolean isSuccess = reservation.makeReservation("John", 3);
        assertTrue(isSuccess);
    }

    @Test
    public void testReservationFailure() {
        HotelReservation reservation = new HotelReservation();
        boolean isSuccess = reservation.makeReservation("Jane", 10);
        assertFalse(isSuccess);
    }
}
