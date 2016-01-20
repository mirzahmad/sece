package org.sece.core.catalog.model.jpa;

import org.sece.core.common.model.jpa.AbstractEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Odiljon Sattarov on 1/18/2016.
 */
@Entity
@AttributeOverride(name = "ID", column = @Column(name = "country_id"))
public class Country extends AbstractEntity {
    @Column(name = "country_name", nullable = false)
    private String countryName;
    @Column(name = "country_code2", nullable = false, length = 2)
    private String countryCode2;
    @Column(name = "country_code3", nullable = false, length = 3)
    private String countryCode3;
    private boolean enabled = true;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", referencedColumnName = "ID")
    private List<State> states;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode2() {
        return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    public String getCountryCode3() {
        return countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }
}
