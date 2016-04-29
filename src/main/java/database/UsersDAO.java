package database;

import accounts.UsersDataSet;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 * @author Константин
 */
class UsersDAO {
    private Session session;

    UsersDAO(Session session) {
        this.session = session;
    }

    UsersDataSet get(long id) throws HibernateException {
        return (UsersDataSet) session.get(UsersDataSet.class, id);
    }

    long getUserId(String login) throws HibernateException {
        Criteria criteria = session.createCriteria(UsersDataSet.class);
        return ((UsersDataSet) criteria.add(Restrictions.eq("login", login)).uniqueResult()).getId();
    }

    long insertUser(UsersDataSet user) throws HibernateException {
        return (Long) session.save(user);
    }
}
