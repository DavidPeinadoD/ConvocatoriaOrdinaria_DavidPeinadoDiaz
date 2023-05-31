package Ejercicio2;

class Certificate {
    private String certificateId;
    private String certificateName;

    public Certificate(String certificateId, String certificateName) {
        this.certificateId = certificateId;
        this.certificateName = certificateName;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }
}