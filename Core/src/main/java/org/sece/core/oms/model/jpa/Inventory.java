package org.sece.core.oms.model.jpa;

import org.sece.core.catalog.model.jpa.Store;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Odiljon Sattarov on 1/18/2016.
 */
@Entity
public class Inventory {

    @EmbeddedId
    private InventoryID inventoryID;
    @ManyToOne
    @MapsId("storeId")
    private Store store;
    private long available = 0;
    @Column(name = "pre_order_available")
    private long preOrderAvailable = 0;
    @Column(name = "back_order_available")
    private long backOrderAvailable = 0;
    @Column(name = "sold_out_threshold")
    private long soldOutThreshold = 0;

    private long placed = 0;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_imported_date")
    private Date lastImportedDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date")
    private Date createdDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_date")
    private Date updatedDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_exported_date")
    private Date lastExportedDate;

    public InventoryID getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(InventoryID inventoryID) {
        this.inventoryID = inventoryID;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public long getAvailable() {
        return available;
    }

    public void setAvailable(long available) {
        this.available = available;
    }

    public long getPreOrderAvailable() {
        return preOrderAvailable;
    }

    public void setPreOrderAvailable(long preOrderAvailable) {
        this.preOrderAvailable = preOrderAvailable;
    }

    public long getBackOrderAvailable() {
        return backOrderAvailable;
    }

    public void setBackOrderAvailable(long backOrderAvailable) {
        this.backOrderAvailable = backOrderAvailable;
    }

    public long getSoldOutThreshold() {
        return soldOutThreshold;
    }

    public void setSoldOutThreshold(long soldOutThreshold) {
        this.soldOutThreshold = soldOutThreshold;
    }

    public long getPlaced() {
        return placed;
    }

    public void setPlaced(long placed) {
        this.placed = placed;
    }

    public Date getLastImportedDate() {
        return lastImportedDate;
    }

    public void setLastImportedDate(Date lastImportedDate) {
        this.lastImportedDate = lastImportedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getLastExportedDate() {
        return lastExportedDate;
    }

    public void setLastExportedDate(Date lastExportedDate) {
        this.lastExportedDate = lastExportedDate;
    }

    @Embeddable
    public static class InventoryID implements Serializable {
        @Column(name = "store_id")
        private int storeId;
        private String sku;

        public int getStoreId() {
            return storeId;
        }

        public void setStoreId(int storeId) {
            this.storeId = storeId;
        }

        public String getSku() {
            return sku;
        }

        public void setSku(String sku) {
            this.sku = sku;
        }

    }
}
