package mate.academy.jpademo.dao;

import org.hibernate.SessionFactory;

import javax.persistence.PersistenceContext;
import java.io.Serializable;

//class for initializing connection (getting session factory);
public abstract class AbstractDao{
    @PersistenceContext
    public final SessionFactory sessionFactory;

    public AbstractDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
