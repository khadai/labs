package persistence.dao;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.iot.model.Drink;

@Named
@Dependent
public class DrinkDaoImpl extends AbstractDao<Drink> implements DrinkDao, Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Drink> getEntityClass() {
        return Drink.class;
    }

    //@Resource
    //private UserTransaction userTransaction;

    @PostConstruct
    public void init() {
        System.out.println("ready");
    }

}

