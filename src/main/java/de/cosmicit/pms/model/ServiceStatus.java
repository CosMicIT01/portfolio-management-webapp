package de.cosmicit.pms.model;


import java.util.HashSet;
import java.util.Set;

public class ServiceStatus {

    private Long id;

    private String serviceStatusCode;

    private String serviceStatusDescription;

    private Set<ServiceRequest> serviceRequests = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceStatusCode() {
        return serviceStatusCode;
    }

    public void setServiceStatusCode(String serviceStatusCode) {
        this.serviceStatusCode = serviceStatusCode;
    }

    public String getServiceStatusDescription() {
        return serviceStatusDescription;
    }

    public void setServiceStatusDescription(String serviceStatusDescription) {
        this.serviceStatusDescription = serviceStatusDescription;
    }

    public void setServiceRequests(Set<ServiceRequest> serviceRequests) {
        if (!this.serviceRequests.isEmpty()) {
            this.serviceRequests.forEach((ServiceRequest serviceRequest) -> serviceRequest.setServiceStatus(null));
            this.serviceRequests.clear();
        }
        serviceRequests.forEach((ServiceRequest serviceRequest) -> serviceRequest.setServiceStatus(this));
        this.serviceRequests.addAll(serviceRequests);
    }

    public void addServiceRequest(ServiceRequest serviceRequest) {
        if (!this.serviceRequests.contains(serviceRequest)) {
            this.serviceRequests.add(serviceRequest);
        }
    }
}
