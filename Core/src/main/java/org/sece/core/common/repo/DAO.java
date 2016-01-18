package org.sece.core.common.repo;

import org.sece.core.common.model.jpa.AbstractEntity;

import javax.persistence.Query;
import java.io.Serializable;
import java.util.List;

/**
 * TODO
 * We should add generic methods for  CriteriaQuery and TypedQuery
 * Created by mirza on 1/14/16.
 */
public interface DAO<T extends AbstractEntity, PK extends Serializable> {
    T create(T t);

    T find(Class type, PK id);

    T update(T t);

    void delete(Class type, PK id);

    List<T> findWithNamedQuery(String queryName, JPAQueryBuilder jpaQueryBuilder);

    List<T> findByQuery(String jpaQuery, JPAQueryBuilder jpaQueryBuilder);

    int execute(String jpaQuery, JPAQueryBuilder jpaQueryBuilder);

    abstract class JPAQueryBuilder {
        public abstract void build(Query query);
    }
}