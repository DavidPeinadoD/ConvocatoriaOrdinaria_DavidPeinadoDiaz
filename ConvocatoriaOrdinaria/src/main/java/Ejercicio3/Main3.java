package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        // Crear objetos Document
        Document legalDoc1 = new Document("LD001", "Legal");
        Document legalDoc2 = new Document("LD002", "Legal");
        Document financialDoc1 = new Document("FD001", "Financial");
        Document financialDoc2 = new Document("FD002", "Financial");
        Document operationalDoc1 = new Document("OD001", "Operational");
        Document operationalDoc2 = new Document("OD002", "Operational");

        // Crear objetos IPORequirements y añadir documentos requeridos
        IPORequirements ipoRequirements = new IPORequirements();
        ipoRequirements.addRequiredDocument(legalDoc1);
        ipoRequirements.addRequiredDocument(financialDoc1);
        ipoRequirements.addRequiredDocument(operationalDoc1);

        // Crear objeto IPOProcess y añadir hitos
        IPOProcess ipoProcess = new IPOProcess();
        Milestone milestone1 = new Milestone("MS001", "Milestone 1", "In Progress");
        Milestone milestone2 = new Milestone("MS002", "Milestone 2", "Completed");
        ipoProcess.addMilestone(milestone1);
        ipoProcess.addMilestone(milestone2);

        // Crear lista de proveedores y añadir documentos proporcionados por cada proveedor
        List<Provider> providers = new ArrayList<>();
        Provider provider1 = new Provider("PR001", "Provider 1");
        provider1.addProvidedDocument(legalDoc1);
        provider1.addProvidedDocument(financialDoc1);
        providers.add(provider1);
        Provider provider2 = new Provider("PR002", "Provider 2");
        provider2.addProvidedDocument(operationalDoc1);
        providers.add(provider2);

        // Crear lista de inversionistas
        List<Investor> investors = new ArrayList<>();
        Investor investor1 = new Investor("IN001", "Investor 1", 1000000);
        investors.add(investor1);
        Investor investor2 = new Investor("IN002", "Investor 2", 500000);
        investors.add(investor2);

        // Crear objeto IPOManagementSystem y establecer los valores
        IPOManagementSystem ipoManagementSystem = new IPOManagementSystem();
        ipoManagementSystem.setIpoRequirements(ipoRequirements);
        ipoManagementSystem.setIpoProcess(ipoProcess);
        ipoManagementSystem.setProviders(providers);
        ipoManagementSystem.setInvestors(investors);

        // Imprimir información del sistema de gestión de IPO
        System.out.println("Sistema de Gestión de IPO - Glamour Beauty");
        System.out.println("------------------------------------------");
        System.out.println("Documentos requeridos:");
        for (Document document : ipoManagementSystem.getIpoRequirements().getRequiredDocuments()) {
            System.out.println("ID: " + document.getDocumentId() + ", Tipo: " + document.getDocumentType());
        }
        System.out.println();
        System.out.println("Hitos del proceso de IPO:");
        for (Milestone milestone : ipoManagementSystem.getIpoProcess().getMilestones()) {
            System.out.println("ID: " + milestone.getMilestoneId() + ", Nombre: " + milestone.getMilestoneName()
                    + ", Estado: " + milestone.getMilestoneStatus());
        }
        System.out.println();
        System.out.println("Proveedores y documentos proporcionados:");
        for (Provider provider : ipoManagementSystem.getProviders()) {
            System.out.println("Proveedor: " + provider.getProviderName());
            for (Document document : provider.getProvidedDocuments()) {
                System.out.println("- ID: " + document.getDocumentId() + ", Tipo: " + document.getDocumentType());
            }
        }
        System.out.println();
        System.out.println("Inversionistas:");
        for (Investor investor : ipoManagementSystem.getInvestors()) {
            System.out.println("ID: " + investor.getInvestorId() + ", Nombre: " + investor.getInvestorName()
                    + ", Monto de inversión: " + investor.getInvestmentAmount());
        }
    }
}
