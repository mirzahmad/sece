package org.sece.core.catalog.model.jpa;

import org.sece.core.common.model.jpa.AbstractEntity;

import javax.persistence.*;

/**
 * Created by Odiljon Sattarov on 1/18/2016.
 */
@Entity
@AttributeOverride(name = "id", column = @Column(name = "store_id"))
public class Store extends AbstractEntity {
    private String name;
    @Lob
    private String description;
    @Embedded
    private Address address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Embeddable
    class Address {
        @Column(name = "address_name")
        private String addressName;
        @Column(name = "street_1", nullable = false)
        private String street1;
        @Column(name = "street_2")
        private String street2;
        private String apt;
        private String city;
        private String state;
        private String country;

        public String getAddressName() {
            return addressName;
        }

        public void setAddressName(String addressName) {
            this.addressName = addressName;
        }

        public String getStreet1() {
            return street1;
        }

        public void setStreet1(String street1) {
            this.street1 = street1;
        }

        public String getStreet2() {
            return street2;
        }

        public void setStreet2(String street2) {
            this.street2 = street2;
        }

        public String getApt() {
            return apt;
        }

        public void setApt(String apt) {
            this.apt = apt;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }

}
