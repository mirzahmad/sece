package org.sece.core.catalog.model.jpa;

import org.sece.core.common.model.jpa.AbstractEntity;

import javax.persistence.*;

/**
 * Created by mr.taranto on 1/16/2016.
 */
@Entity
@AttributeOverride(name = "ID", column = @Column(name = "category_id"))
public class Category extends AbstractEntity {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    @Lob
    private String description;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parentId;
    @Column(name = "meta_tags")
    private String metaTags;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "parent_ids")
    private String parentIds;
    @Column(name = "category_order")
    private int order;
    private boolean enabled;

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

    public Category getParentId() {
        return parentId;
    }

    public void setParentId(Category parentId) {
        this.parentId = parentId;
    }

    public String getMetaTags() {
        return metaTags;
    }

    public void setMetaTags(String metaTags) {
        this.metaTags = metaTags;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
