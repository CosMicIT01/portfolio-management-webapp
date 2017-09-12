package de.cosmicit.pms.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

public class Subscription {


    private Long id;

    private String name;

    private DateTime creationDate;

    private DateTime expiryDate;

    private DateTime renewalDate;

    //    @JsonDeserialize(using = ReferenceDeserializer.class)
    @JsonProperty("subscriptionType")
    private int subscriptionType;

    //    @JsonDeserialize(using = ReferenceDeserializer.class)
    @JsonProperty("service")
    private int service;

    //    @JsonDeserialize(using = ReferenceDeserializer.class)
    @JsonProperty("customer")
    private int customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(DateTime creationDate) {
        this.creationDate = creationDate;
    }

    public int getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(int subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public DateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(DateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public DateTime getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(DateTime renewalDate) {
        this.renewalDate = renewalDate;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creationDate=" + creationDate +
                ", expiryDate=" + expiryDate +
                ", renewalDate=" + renewalDate +
                ", subscriptionType=" + subscriptionType +
                ", service=" + service +
                ", customer=" + customer +
                '}';
    }
}
