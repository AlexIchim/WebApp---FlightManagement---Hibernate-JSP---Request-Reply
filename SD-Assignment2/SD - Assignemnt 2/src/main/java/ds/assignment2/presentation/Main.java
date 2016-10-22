package ds.assignment2.presentation;

import ds.assignment2.data.CitiesDAO;
import ds.assignment2.data.FlightsDAO;
import ds.assignment2.data.UsersDAO;
import ds.assignment2.entities.Flight;
import ds.assignment2.enums.Role;
import org.hibernate.cfg.*;
import ds.assignment2.entities.User;
import ds.assignment2.entities.City;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex PC on 15/10/2016.
 */
public class Main {

    private CitiesDAO cityDAO;

    public static void main (String[] args) {

        Main.testMethodUsers();;
    }

    public static void testMethodCity () {
        CitiesDAO cityDAO;
        cityDAO = new CitiesDAO(new Configuration().configure().buildSessionFactory());
        City city = new City("Cluj", 35, 45);

        cityDAO.addCity(city);

        List<City> cities = cityDAO.getCities();

        System.out.println("CITIES\n");
        for (City cityIterator : cities) {
            System.out.println(cityIterator.toString());
        }
    }

    public static void testMethodFlight () {
        CitiesDAO cityDAO;
        cityDAO = new CitiesDAO(new Configuration().configure().buildSessionFactory());

        FlightsDAO flightDAO;
        flightDAO = new FlightsDAO(new Configuration().configure().buildSessionFactory());

        City cityMockDeparture = new City("Cluj", 13, 15);
        City cityMockArrival = new City("Oradea", 13, 15);
        cityDAO.addCity(cityMockDeparture);
        cityDAO.addCity(cityMockArrival);
        Flight flight = new Flight("Boeing", cityMockDeparture, new Date(), new Date(), cityMockArrival, new Date(), new Date());


        Flight addedFlight = flightDAO.addFlight(flight);

        List<Flight> flightsReturned = flightDAO.getFlights();

        for (Flight f : flightsReturned) {
            System.out.println(f.getAirplane_type());
        }
    }

    public static void testMethodUsers() {
        UsersDAO userDAO = new UsersDAO(new Configuration().configure().buildSessionFactory());

        User user = new User("Alex", "Password", Role.REGULARUSER);
        //System.out.println(Role.REGULARUSER.getRoleNumber());
        User addedUser = userDAO.addUser(user);

        //System.out.println(userDAO.getUser(addedUser.getUsername()).getRole());
    }
}
