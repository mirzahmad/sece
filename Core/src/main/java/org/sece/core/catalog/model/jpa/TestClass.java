package org.sece.core.catalog.model.jpa;

import org.sece.core.catalog.model.AbstractEntity;

import javax.persistence.*;

/**
 * Created by mirza on 1/13/16.
 */
@Table(name = "testTable")
@Entity
public class TestClass extends AbstractEntity {

    private String name;

    public TestClass() {
    }

    public TestClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
