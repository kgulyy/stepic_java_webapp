package servlets;

import accounts.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author k.gulyy
 */
public class UserServlet extends HttpServlet {
    private final AccountService accountService;

    public UserServlet(AccountService accountService) {
        this.accountService = accountService;
    }

    // get public user profile
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: 26.04.2016  
    }

    //sing up
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: 26.04.2016  
    }

    // change profile
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: 26.04.2016  
    }

    // unregister
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: 26.04.2016  
    }
}
