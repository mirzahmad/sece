package org.sece.core.catalog.repo.jpa;

import org.sece.core.catalog.model.AbstractEntity;
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
public class GenericDAO<T extends AbstractEntity, PK extends Serializable> implements DAO<T, PK> {

    @PersistenceContext(unitName = "seceUnit") //TODO, do research if we want shared or not
    private EntityManager em;

    @Override
    public T create(T t) {
        this.em.persist(t); //TODO, do research here, do we want flush?
        this.em.flush();
        this.em.refresh(t);
        return t;
    }

    @Override
    public T find(Class type, PK id) {
        return (T) em.find(type, id);
    }

    @Override
    public T update(T t) {
        return em.merge(t);
    }

    @Override
    public void delete(Class type, PK id) {
        //TODO
        Object ref = this.em.getReference(type, id);
        this.em.remove(ref);
    }

    @Override
    public List<T> findWithNamedQuery(String queryName, JPAQueryBuilder jpaQueryBuilder) {
        Query query = em.createNamedQuery(queryName);
        if (jpaQueryBuilder != null) {
            jpaQueryBuilder.build(query);
        }
        return query.getResultList();
    }

    public List<T> findByQuery(String jpaQuery, JPAQueryBuilder jpaQueryBuilder) {
        Query q = em.createQuery(jpaQuery);
        if (jpaQueryBuilder != null) {
            jpaQueryBuilder.build(q);
        }
        return q.getResultList();
    }

    @Override
    public int execute(String jpaQuery, JPAQueryBuilder jpaQueryBuilder) {
        Query query = em.createQuery(jpaQuery);
        if (jpaQueryBuilder != null) {
            jpaQueryBuilder.build(query);
        }
        return query.executeUpdate();
    }
}