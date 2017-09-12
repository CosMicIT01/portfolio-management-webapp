package de.cosmicit.pms.model;

import java.util.HashSet;
import java.util.Set;

public class DocumentType {


    private Long id;
    private String documentTypeCode;
    private String documentTypeDescription;
    private Set<Document> documents = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentTypeCode() {
        return documentTypeCode;
    }

    public void setDocumentTypeCode(String documentTypeCode) {
        this.documentTypeCode = documentTypeCode;
    }

    public String getDocumentTypeDescription() {
        return documentTypeDescription;
    }

    public void setDocumentTypeDescription(String documentTypeDescription) {
        this.documentTypeDescription = documentTypeDescription;
    }

    public Set<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(Set<Document> documents) {
        if (!this.documents.isEmpty()) {
            this.documents.forEach((Document document) -> document.setDocumentType(null));
            this.documents.clear();
        }
        documents.forEach((Document document) -> document.setDocumentType(this));
        this.documents.addAll(documents);
    }

    public void addDocument(Document document) {
        if (!this.documents.contains(document)) {
            this.documents.add(document);
        }
    }
}
