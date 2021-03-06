package org.sece.core.catalog.model.jpa;

import org.sece.core.common.model.jpa.AbstractEntity;

import javax.persistence.*;

/**
 * Created by mr.taranto on 1/16/2016.
 */
@Entity
@Table(name = "product_item_media_files")
@AttributeOverride(name = "id", column = @Column(name = "media_file_id"))
public class ProductItemMediaFiles extends AbstractEntity{

    @Column(name = "media_type", nullable = false)
    private char mediaType;
    @Column(name = "small_image_url", nullable = false)
    private String smallImageUrl;
    @Column(name = "large_file_url", nullable = false)
    private String largeFileUrl;

    public char getMediaType() {
        return mediaType;
    }

    public void setMediaType(char mediaType) {
        this.mediaType = mediaType;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getLargeFileUrl() {
        return largeFileUrl;
    }

    public void setLargeFileUrl(String largeFileUrl) {
        this.largeFileUrl = largeFileUrl;
    }
}
