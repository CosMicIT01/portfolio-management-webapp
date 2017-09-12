package de.cosmicit.pms.model;

import java.util.HashSet;
import java.util.Set;

/**
 * This class represents the Service Entity of the Application
 */
public class Service {

    private Long Id;

    private String serviceCode;

    private String serviceDescription;

    private Set<ServiceRequest> serviceRequests = new HashSet<>();

    private Set<Promotion> promotions = new HashSet<>();

    private ServiceProvider serviceProvider;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public Set<ServiceRequest> getServiceRequests() {
        return serviceRequests;
    }

    public void setServiceRequests(Set<ServiceRequest> serviceRequests) {
        if (!this.serviceRequests.isEmpty()) {
            this.serviceRequests.forEach((ServiceRequest serviceRequest) -> serviceRequest.setService(null));
            this.serviceRequests.clear();
        }
        serviceRequests.forEach((ServiceRequest serviceRequest) -> serviceRequest.setService(this));
        this.serviceRequests.addAll(serviceRequests);
    }

    public void addServiceRequest(ServiceRequest serviceRequest) {
        if (!this.serviceRequests.contains(serviceRequest)) {
            this.serviceRequests.add(serviceRequest);
        }
    }


    public Set<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(Set<Promotion> promotions) {
        if (!this.promotions.isEmpty()) {
            this.promotions.forEach((Promotion promotion) -> promotion.setService(null));
            this.promotions.clear();
        }
        promotions.forEach((Promotion promotion) -> promotion.setService(this));
        this.promotions.addAll(promotions);
    }

    public void addPromotion(Promotion promotion) {
        if (!this.promotions.contains(promotion)) {
            this.promotions.add(promotion);
        }
    }
}
