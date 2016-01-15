package org.sece.core.catalog.repo;

import org.sece.core.catalog.model.AbstractEntity;

import javax.persistence.Query;
import java.io.Serializable;
import java.util.List;

/**
 * TODO
 * We should add generic methods for  CriteriaQuery and TypedQuery
 * Created by mirza on 1/14/16.
 */
public interface DAO<T extends AbstractEntity, PK extends Serializable> {
    public T create(T t);

    public T find(Class type, PK id);

    public T update(T t);

    public void delete(Class type, PK id);

    public List<T> findWithNamedQuery(String queryName, JPAQueryBuilder jpaQueryBuilder);

    public List<T> finByQuery(String jpaQuery, JPAQueryBuilder jpaQueryBuilder);

    public int execute(String jpaQuery, JPAQueryBuilder jpaQueryBuilder);

    public abstract static class JPAQueryBuilder {
        public abstract void build(Query query);
    }
}