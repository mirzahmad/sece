package org.sece.core.catalog.model.jpa;

import org.sece.core.common.model.jpa.AbstractEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mr.taranto on 1/17/2016.
 */
@Entity
@AttributeOverride(name = "id", column = @Column(name = "option_id"))
public class Option extends AbstractEntity {
    @Column(name = "option_code", nullable = false)
    private char optionCode;
    @Column(name = "option_name", nullable = false)
    private String optionName;
    @Column(name = "option_value", nullable = false)
    private String optionValue;
    @Column(name = "option_type", nullable = false)
    private String optionType;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "option_id", referencedColumnName = "option_id")
    private List<ProductItemOption> productItemOptions;

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

    public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    public List<ProductItemOption> getProductItemOptions() {
        return productItemOptions;
    }

    public void setProductItemOptions(List<ProductItemOption> productItemOptions) {
        this.productItemOptions = productItemOptions;
    }
}
