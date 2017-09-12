package de.cosmicit.pms.model;

import org.joda.time.DateTime;

import java.util.HashSet;
import java.util.Set;

/**
 * This class represents the Service Entity of the Application
 */
public class ServiceContract {

    private Long id;

    private DateTime startDate;

    private DateTime endDate;

    private int duration;

    private Set<Document> documents= new HashSet<>();

    private Service service;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Set<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(Set<Document> documents) {
        if (!this.documents.isEmpty()) {
            this.documents.forEach((Document document) -> document.setServiceContract(null));
            this.documents.clear();
        }
        documents.forEach((Document document) -> document.setServiceContract(this));
        this.documents.addAll(documents);
    }

    public void addDocument(Document document) {
        if (!this.documents.contains(document)) {
            this.documents.add(document);
        }
    }
}
