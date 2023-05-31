package Ejercicio3;

public class Document {
    private String documentId;
    private String documentType;

    public Document(String documentId, String documentType) {
        this.documentId = documentId;
        this.documentType = documentType;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }
}
