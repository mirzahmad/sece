package org.sece.core.catalog.repo.jpa;

import org.sece.core.catalog.model.AbstractEntity;
import org.sece.core.catalog.model.jpa.TestClass;
import org.sece.core.catalog.repo.DAO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.List;

/**
 * Created by mirza on 1/14/16.
 */
@Repository
public class TestDAO extends GenericDAO<TestClass, Long> {

}