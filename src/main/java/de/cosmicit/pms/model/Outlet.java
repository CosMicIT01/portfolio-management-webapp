package de.cosmicit.pms.model;

import java.util.HashSet;
import java.util.Set;

/**
 * This class represents the Agent Entity of the Application
 */
public class Outlet {

    private Long id;
    private String outletName;
    private String address;
    private String city;
    private String country;
    private Set<ServiceRequest> serviceRequests = new HashSet<>();
    private OutletType outletType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOutletName() {
        return outletName;
    }

    public void setOutletName(String outletName) {
        this.outletName = outletName;
    }

    public OutletType getOutletType() {
        return outletType;
    }

    public void setOutletType(OutletType outletType) {
        this.outletType = outletType;
    }

    public Set<ServiceRequest> getServiceRequests() {
        return serviceRequests;
    }

    public void setServiceRequests(Set<ServiceRequest> serviceRequests) {
        if (!this.serviceRequests.isEmpty()) {
            this.serviceRequests.forEach((ServiceRequest serviceRequest) -> serviceRequest.setOutlet(null));
            this.serviceRequests.clear();
        }
        serviceRequests.forEach((ServiceRequest serviceRequest) -> serviceRequest.setOutlet(this));
        this.serviceRequests.addAll(serviceRequests);
    }

    public void addServiceRequest(ServiceRequest serviceRequest) {
        if (!this.serviceRequests.contains(serviceRequest)) {
            this.serviceRequests.add(serviceRequest);
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
