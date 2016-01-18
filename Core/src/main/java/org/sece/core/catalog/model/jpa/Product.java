package org.sece.core.catalog.model.jpa;


import org.sece.core.common.model.jpa.AbstractDatableEntity;

import javax.persistence.*;

/**
 * Created by mr.taranto on 1/16/2016.
 */
@Entity
@AttributeOverride(name = "ID", column = @Column(name = "product_id"))
public class Product extends AbstractDatableEntity {

    @Column(nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String code;
    @Lob
    private String description;
    @Column(nullable = false)
    private String type;
    @Lob
    private String keywords;
    @Column(nullable = false)
    private boolean enabled;
    @Column(name = "made_in")
    private String madeIn;
    @Column(name = "manufacturer_id")
    private Long manufacturerId;
    @Column(name = "average_customer_review")
    private float averageCustomerReview = 0.0f;
    @Column(name = "customer_review_totals")
    private int customerReviewTotals = 0;
    @Column(name = "image_urls", nullable = false)
    private String imageUrls;
    @Column(name = "related_products")
    private String relatedProducts;
    @Lob
    @Column(name = "warranty_message")
    private String warrantyMessage;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category categoryId;
    @Column(name = "total_sold")
    private long totalSold = 0;
    @Column(name = "template_file_name", nullable = false)
    private String templateFileName;
    @Column(name = "page_title")
    private String pageTitle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public Long getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public float getAverageCustomerReview() {
        return averageCustomerReview;
    }

    public void setAverageCustomerReview(float averageCustomerReview) {
        this.averageCustomerReview = averageCustomerReview;
    }

    public int getCustomerReviewTotals() {
        return customerReviewTotals;
    }

    public void setCustomerReviewTotals(int customerReviewTotals) {
        this.customerReviewTotals = customerReviewTotals;
    }

    public String getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(String relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public String getWarrantyMessage() {
        return warrantyMessage;
    }

    public void setWarrantyMessage(String warrantyMessage) {
        this.warrantyMessage = warrantyMessage;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    public long getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(long totalSold) {
        this.totalSold = totalSold;
    }

    public String getTemplateFileName() {
        return templateFileName;
    }

    public void setTemplateFileName(String templateFileName) {
        this.templateFileName = templateFileName;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }
}
