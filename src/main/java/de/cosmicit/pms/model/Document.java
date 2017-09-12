package de.cosmicit.pms.model;

import com.fasterxml.jackson.annotation.JsonValue;
import org.joda.time.DateTime;

public class Document {

    public enum ApprovalStatus {
        PENDING,
        REJECTED,
        APPROVED;

        public String value() {
            return this.name().toLowerCase();
        }
    }

    private Long id;
    private String name;
    private String url;
    private String signedBy;
    private String approvedBy;
    private ApprovalStatus approvalStatus;
    private DateTime creationDate;
    private DateTime approvalDate;
    private DocumentType documentType;
    private ServiceRequest serviceRequest;
    private ServiceContract serviceContract;


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

    public String getSignedBy() {
        return signedBy;
    }

    public void setSignedBy(String signedBy) {
        this.signedBy = signedBy;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(ServiceRequest serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public DateTime getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(DateTime approvalDate) {
        this.approvalDate = approvalDate;
    }

    public void setCreationDate(DateTime creationDate) {
        this.creationDate = creationDate;
    }

    public DateTime getCreationDate() {
        return creationDate;
    }

    public ServiceContract getServiceContract() {
        return serviceContract;
    }

    public void setServiceContract(ServiceContract serviceContract) {
        this.serviceContract = serviceContract;
    }
}
