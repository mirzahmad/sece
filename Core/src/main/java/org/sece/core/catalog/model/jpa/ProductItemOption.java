package org.sece.core.catalog.model.jpa;

import org.sece.core.catalog.model.AbstractEntity;

import javax.persistence.*;

/**
 * Created by mr.taranto on 1/16/2016.
 */
@Entity
@Table(name = "product_item_option")
@AttributeOverride(name = "ID", column = @Column(name = "product_item_option_id"))
public class ProductItemOption extends AbstractEntity{

    @Column(name = "option_code", nullable = false)
    private char optionCode;
    @Column(name = "option_name", nullable = false)
    private String optionName;
    @Column(name = "option_value", nullable = false)
    private String optionValue;
    @Column(nullable = false)
    private boolean enabled;
    @Column(name = "sort_order")
    private short sortOrder;

    public char getOptionCode() {
        return optionCode;
    }

    public void setOptionCode(char optionCode) {
        this.optionCode = optionCode;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public short getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(short sortOrder) {
        this.sortOrder = sortOrder;
    }
}
