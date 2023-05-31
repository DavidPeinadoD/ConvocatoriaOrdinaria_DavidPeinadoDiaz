package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Provider {
    private String providerId;
    private String providerName;
    private List<Document> providedDocuments;

    public Provider(String providerId, String providerName) {
        this.providerId = providerId;
        this.providerName = providerName;
        providedDocuments = new ArrayList<>();
    }

    public void addProvidedDocument(Document document) {
        providedDocuments.add(document);
    }

    public void removeProvidedDocument(Document document) {
        providedDocuments.remove(document);
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public List<Document> getProvidedDocuments() {
        return providedDocuments;
    }

    public void setProvidedDocuments(List<Document> providedDocuments) {
        this.providedDocuments = providedDocuments;
    }
}
