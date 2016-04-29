package accounts;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author k.gulyy
 */
@Entity
@Table(name = "users")
public class UsersDataSet implements Serializable { // Serializable Important to Hibernate!

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, updatable = false)
    private String login;

    private String pass;

    //Important to Hibernate!
    @SuppressWarnings("UnusedDeclaration")
    public UsersDataSet() {
    }

    public UsersDataSet(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public long getId() {
        return id;
    }

    @SuppressWarnings("UnusedDeclaration")
    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    @SuppressWarnings("UnusedDeclaration")
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    @SuppressWarnings("UnusedDeclaration")
    public void setPass(String pass) {
        this.pass = pass;
    }
}
