package database;

/**
 * @author Константин
 */
public class DBException extends Exception {
    DBException(Throwable throwable) {
        super(throwable);
    }
}
