package de.cosmicit.pms.model;

import java.util.HashSet;
import java.util.Set;

public class ServiceProvider {

    private Long Id;

    private String name;

    private String region;

    private String domain;

    private String registrationNumber;

    private Set<Service> services = new HashSet<>();

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        if (!this.services.isEmpty()) {
            this.services.forEach((Service service) -> service.setServiceProvider(null));
            this.services.clear();
        }
        services.forEach((Service service) -> service.setServiceProvider(this));
        this.services.addAll(services);
    }

    public void addService(Service service) {
        if (!this.services.contains(service)) {
            this.services.add(service);
        }
    }
}
