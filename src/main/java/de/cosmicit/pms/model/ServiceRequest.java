package de.cosmicit.pms.model;

import java.util.HashSet;
import java.util.Set;

/**
 * This class represents the Service ServiceContract Entity of the Application
 */
public class ServiceRequest {

    private Long id;

    private Customer customer;

    private Outlet outlet;

    private Agent agent;

    private Service service;

    private ServiceStatus serviceStatus;


    private Set<Document> documents = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public Outlet getOutlet() {
        return outlet;
    }

    public void setOutlet(Outlet outlet) {
        this.outlet = outlet;
    }

    public Set<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(Set<Document> documents) {
        if (!this.documents.isEmpty()) {
            this.documents.forEach((Document document) -> document.setServiceRequest(null));
            this.documents.clear();
        }
        documents.forEach((Document document) -> document.setServiceRequest(this));
        this.documents.addAll(documents);
    }

    public void addDocument(Document document) {
        if (!this.documents.contains(document)) {
            this.documents.add(document);
        }
    }
}
