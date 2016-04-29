package main;

import database.DBService;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.SessionsServlet;
import servlets.UserServlet;

/**
 * @author k.gulyy
 */
public class Main {
    public static void main(String[] args) throws Exception {
        DBService dbService = new DBService();

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(new UserServlet(dbService)), "/signup");
        context.addServlet(new ServletHolder(new SessionsServlet(dbService)), "/signin");

        Server server = new Server(8080);
        server.setHandler(context);

        System.out.println("Server started");
        server.start();
        server.join();
    }
}
