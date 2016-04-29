package servlets;

import accounts.UsersDataSet;
import database.DBException;
import database.DBService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Константин
 */
public class SessionsServlet extends HttpServlet {
    private final DBService dbService;

    public SessionsServlet(DBService dbService) {
        this.dbService = dbService;
    }

    /**
     * sing in
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String pass = req.getParameter("password");

        if(login == null || pass == null) {
            resp.setContentType("text/html;charset=utf-8");
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        try {
            UsersDataSet user = dbService.getUserByLogin(login);
            if (user == null || !user.getPass().equals(pass)) {
                resp.setContentType("text/html;charset=utf-8");
                resp.getWriter().println("Unauthorized");
                resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            } else {
                resp.setContentType("text/html;charset=utf-8");
                resp.getWriter().println("Authorized: " + user.getLogin());
                resp.setStatus(HttpServletResponse.SC_OK);
            }
        } catch (DBException e) {
            e.printStackTrace();
        }
    }
}
