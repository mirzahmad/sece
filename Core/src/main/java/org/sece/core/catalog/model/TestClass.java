package org.sece.core.catalog.model;

import javax.persistence.*;

/**
 * Created by elbek on 1/13/16.
 */
@Table(name = "testTable")
@Entity
public class TestClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    public TestClass() {
    }

    public TestClass(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
