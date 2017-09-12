package de.cosmicit.pms.model;

import java.util.HashSet;
import java.util.Set;

public class OutletType {

    private Long id;
    private String outletTypeCode;
    private String outletTypeDescription;
    private Set<Outlet> outlets = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOutletTypeCode() {
        return outletTypeCode;
    }

    public void setOutletTypeCode(String outletTypeCode) {
        this.outletTypeCode = outletTypeCode;
    }

    public String getOutletTypeDescription() {
        return outletTypeDescription;
    }

    public void setOutletTypeDescription(String outletTypeDescription) {
        this.outletTypeDescription = outletTypeDescription;
    }

    public Set<Outlet> getOutlets() {
        return outlets;
    }

    public void setOutlets(Set<Outlet> outlets) {
        if (!this.outlets.isEmpty()) {
            this.outlets.forEach((Outlet outlet) -> outlet.setOutletType(null));
            this.outlets.clear();
        }
        outlets.forEach((Outlet outlet) -> outlet.setOutletType(this));
        this.outlets.addAll(outlets);
    }

    public void addOutlet(Outlet outlet) {
        if (!this.outlets.contains(outlet)) {
            this.outlets.add(outlet);
        }
    }
}
