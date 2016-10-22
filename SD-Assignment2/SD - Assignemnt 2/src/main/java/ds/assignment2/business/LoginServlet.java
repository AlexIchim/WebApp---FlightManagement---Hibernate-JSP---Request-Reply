package ds.assignment2.business;

import ds.assignment2.data.*;
import ds.assignment2.entities.User;
import ds.assignment2.enums.Role;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

/**
 * Created by Alex PC on 18/10/2016.
 */

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"} )
public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String userName = req.getParameter("username");
        String userPassword = req.getParameter("password");

        HttpSession session = req.getSession(false);

        UsersDAO usersDAO = new UsersDAO(new Configuration().configure().buildSessionFactory());


        User user = usersDAO.getUser(userName);

        if (user == null) {
            session.setAttribute("login_message", "Invalid user credentials");
            res.sendRedirect("login.jsp");
        } else if (!userPassword.equals(user.getPassword())) {
            session.setAttribute("login_message", "Invalid password! Please try again!");
        } else {

            session.setAttribute("user", user);

            if (user.getRole().equals(Role.ADMIN)) {
                CitiesDAO citiesDAO = new CitiesDAO(new Configuration().configure().buildSessionFactory());
                List cities = citiesDAO.getCities();
                session.setAttribute("cities", cities);

                FlightsDAO flightsDAO = new FlightsDAO(new Configuration().configure().buildSessionFactory())
                List flights = flightsDAO.getFlights();
                session.setAttribute("flights", flights);
            } else {
                FlightsDAO flightsDAO = new FlightsDAO(new Configuration().configure().buildSessionFactory());
                List flights = flightsDAO.getFlights();
                session.setAttribute("flights", flights);
            }
        }
    }
}
