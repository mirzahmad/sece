package org.sece.core.catalog.model.jpa;

import org.sece.core.common.model.jpa.AbstractDatableEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by mr.taranto on 1/16/2016.
 */
@Entity
@Table(name = "product_item")
@AttributeOverride(name = "ID", column = @Column(name = "product_item_id"))
public class ProductItem extends AbstractDatableEntity {

    public enum Condition {
        NEW,
        USED_GOOD,
        USED_ACCEPTABLE,
        REFURBISHED;
    }

    @Column(unique = true, nullable = false)
    private String sku;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;
    private Integer cost = 0;
    @Column(name = "regular_price", nullable = false)
    private Integer regularPrice;
    @Column(name = "special_price")
    private Integer specialPrice;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "special_price_begin_date")
    private Date specialPriceBeginDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "special_price_end_date")
    private Date specialPriceEndDate;
    @Column(name = "tax_cost")
    private Integer taxCost = 0;
    @Column(name = "shipping_cost")
    private Integer shippingCost = 0;
    @Column(name = "gift_wrap_available")
    private boolean giftWrapAvailable;
    @Column(name = "gift_wrap_cost")
    private Integer giftWrapCost = 0;
    @Column(name = "tax_exempt")
    private boolean taxExempt;
    private float weight = 0.0f;
    private float width = 0.0f;
    private float height = 0.0f;
    @Column(name = "product_item_depth")
    private float depth = 0.0f;
    @Column(nullable = false)
    private boolean enabled;
    @Column(name = "special_message")
    private String specialMessage;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "pre_order_release_date")
    private Date preOrderReleaseDate;
    @Column(name = "mint_qty_to_order")
    private short mintQtyToOrder = 1;
    @Column(name = "always_available")
    private boolean alwaysAvailable = false;
    @Lob
    private String description;
    @Enumerated(EnumType.STRING)
    @Column(name = "product_item_condition")
    private Condition condition;
    @Lob
    private String warranty;
    @Column(name = "handling_fee")
    private long handlingFee = 0;
    @Column(name = "handling_cost")
    private long handlingCost = 0;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_item_id", referencedColumnName = "ID")
    private List<ProductItemOption> productItemOptions;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_item_id", referencedColumnName = "ID")
    private List<ProductItemMediaFiles> productItemMediaFiles;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(Integer regularPrice) {
        this.regularPrice = regularPrice;
    }

    public Integer getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(Integer specialPrice) {
        this.specialPrice = specialPrice;
    }

    public Date getSpecialPriceBeginDate() {
        return specialPriceBeginDate;
    }

    public void setSpecialPriceBeginDate(Date specialPriceBeginDate) {
        this.specialPriceBeginDate = specialPriceBeginDate;
    }

    public Date getSpecialPriceEndDate() {
        return specialPriceEndDate;
    }

    public void setSpecialPriceEndDate(Date specialPriceEndDate) {
        this.specialPriceEndDate = specialPriceEndDate;
    }

    public Integer getTaxCost() {
        return taxCost;
    }

    public void setTaxCost(Integer taxCost) {
        this.taxCost = taxCost;
    }

    public Integer getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Integer shippingCost) {
        this.shippingCost = shippingCost;
    }

    public boolean isGiftWrapAvailable() {
        return giftWrapAvailable;
    }

    public void setGiftWrapAvailable(boolean giftWrapAvailable) {
        this.giftWrapAvailable = giftWrapAvailable;
    }

    public Integer getGiftWrapCost() {
        return giftWrapCost;
    }

    public void setGiftWrapCost(Integer giftWrapCost) {
        this.giftWrapCost = giftWrapCost;
    }

    public boolean isTaxExempt() {
        return taxExempt;
    }

    public void setTaxExempt(boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getSpecialMessage() {
        return specialMessage;
    }

    public void setSpecialMessage(String specialMessage) {
        this.specialMessage = specialMessage;
    }

    public Date getPreOrderReleaseDate() {
        return preOrderReleaseDate;
    }

    public void setPreOrderReleaseDate(Date preOrderReleaseDate) {
        this.preOrderReleaseDate = preOrderReleaseDate;
    }

    public short getMintQtyToOrder() {
        return mintQtyToOrder;
    }

    public void setMintQtyToOrder(short mintQtyToOrder) {
        this.mintQtyToOrder = mintQtyToOrder;
    }

    public boolean isAlwaysAvailable() {
        return alwaysAvailable;
    }

    public void setAlwaysAvailable(boolean alwaysAvailable) {
        this.alwaysAvailable = alwaysAvailable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public long getHandlingFee() {
        return handlingFee;
    }

    public void setHandlingFee(long handlingFee) {
        this.handlingFee = handlingFee;
    }

    public long getHandlingCost() {
        return handlingCost;
    }

    public void setHandlingCost(long handlingCost) {
        this.handlingCost = handlingCost;
    }

    public List<ProductItemOption> getProductItemOptions() {
        return productItemOptions;
    }

    public void setProductItemOptions(List<ProductItemOption> productItemOptions) {
        this.productItemOptions = productItemOptions;
    }

    public List<ProductItemMediaFiles> getProductItemMediaFiles() {
        return productItemMediaFiles;
    }

    public void setProductItemMediaFiles(List<ProductItemMediaFiles> productItemMediaFiles) {
        this.productItemMediaFiles = productItemMediaFiles;
    }
}
