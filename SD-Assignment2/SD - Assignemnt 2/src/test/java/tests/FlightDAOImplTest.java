package tests;

import ds.assignment2.data.CitiesDAO;
import ds.assignment2.data.FlightsDAO;
import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by Alex PC on 17/10/2016.
 */
public class FlightDAOImplTest {

    FlightsDAO flightDAO;
    CitiesDAO cityDAO;

    @Before
    public void setUp() {
        flightDAO = new FlightsDAO(new org.hibernate.cfg.Configuration().configure().buildSessionFactory());
        cityDAO = new CitiesDAO(new org.hibernate.cfg.Configuration().buildSessionFactory());
    }

//
//    @Test
//    public void testAddCity() {
//
//        City cityMockDeparture = new City("Cluj", 13, 15);
//        City cityMockArrival = new City("Oradea", 13, 15);
//        cityDAO.addCity(cityMockDeparture);
//        cityDAO.addCity(cityMockArrival);
//        Flight flight = new Flight("Boeing", cityMockDeparture, new Date(), LocalDateTime.now(), cityMockArrival, new Date(), LocalDateTime.now());
//
//        Flight addedFlight = flightDAO.addFlight(flight);
//
//        assertEquals(addedFlight, addedFlight);
//    }
//}
}
