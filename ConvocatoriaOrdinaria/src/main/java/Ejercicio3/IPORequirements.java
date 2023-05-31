package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class IPORequirements {
    private List<Document> requiredDocuments;

    public IPORequirements() {
        requiredDocuments = new ArrayList<>();
    }

    public void addRequiredDocument(Document document) {
        requiredDocuments.add(document);
    }

    public void removeRequiredDocument(Document document) {
        requiredDocuments.remove(document);
    }

    public List<Document> getRequiredDocuments() {
        return requiredDocuments;
    }

    public void setRequiredDocuments(List<Document> requiredDocuments) {
        this.requiredDocuments = requiredDocuments;
    }
}
