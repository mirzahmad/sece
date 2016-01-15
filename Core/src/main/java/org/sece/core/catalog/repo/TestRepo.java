package org.sece.core.catalog.repo;

import org.sece.core.catalog.model.jpa.TestClass;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by mirza on 1/13/16.
 */
@Repository
public class TestRepo {

    @PersistenceContext(unitName = "seceUnit")
    private EntityManager em;

    @Transactional(propagation = Propagation.REQUIRED)
    public void save(TestClass testClass) {
        if (testClass.getId() == null) {
            this.em.persist(testClass);
        } else {
            this.em.merge(testClass);
        }
    }
}