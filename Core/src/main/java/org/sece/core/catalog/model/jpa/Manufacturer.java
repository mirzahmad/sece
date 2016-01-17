package org.sece.core.catalog.model.jpa;

import javax.persistence.*;

/**
 * Created by mr.taranto on 1/16/2016.
 */
@Entity
@AttributeOverride(name = "ID", column = @Column(name = "manufacturer_id"))
public class Manufacturer {

    @Column(nullable = false)
    private String name;
    @Lob
    @Column(nullable = false)
    private String description;
    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}