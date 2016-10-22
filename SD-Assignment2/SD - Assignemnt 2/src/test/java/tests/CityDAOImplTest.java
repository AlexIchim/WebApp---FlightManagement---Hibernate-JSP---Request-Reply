package tests;

import ds.assignment2.data.CitiesDAO;
import ds.assignment2.entities.City;
import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by Alex PC on 17/10/2016.
 */
public class CityDAOImplTest {

    CitiesDAO cityDAO;

    @Before
    public void setUp() {
        cityDAO = new CitiesDAO(new org.hibernate.cfg.Configuration().configure().buildSessionFactory());
    }

    @Test
    public void testAddCity() {
        City cityMock = new City("Cluj", 13, 15);
        City cityResult = cityDAO.addCity(cityMock);

        City cityResultQuery = cityDAO.findCity(cityResult.getId());

        assertEquals(cityMock, cityResult);
    }
}
