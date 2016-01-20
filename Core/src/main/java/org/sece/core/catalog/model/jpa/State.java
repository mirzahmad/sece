package org.sece.core.catalog.model.jpa;

import org.sece.core.common.model.jpa.AbstractEntity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Odiljon Sattarov on 1/18/2016.
 */
@Entity
@AttributeOverride(name = "ID", column = @Column(name = "state_id"))
public class State extends AbstractEntity {
    @Column(name = "state_name", nullable = false)
    private String stateName;
    @Column(name = "state_code", nullable = false)
    private String stateCode;
    private boolean enabled;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
