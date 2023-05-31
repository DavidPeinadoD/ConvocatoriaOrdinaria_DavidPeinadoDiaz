package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class IPOManagementSystem {
    private IPORequirements ipoRequirements;
    private IPOProcess ipoProcess;
    private List<Provider> providers;
    private List<Investor> investors;

    public IPOManagementSystem() {
        ipoRequirements = new IPORequirements();
        ipoProcess = new IPOProcess();
        providers = new ArrayList<>();
        investors = new ArrayList<>();
    }

    public IPORequirements getIpoRequirements() {
        return ipoRequirements;
    }

    public void setIpoRequirements(IPORequirements ipoRequirements) {
        this.ipoRequirements = ipoRequirements;
    }

    public IPOProcess getIpoProcess() {
        return ipoProcess;
    }

    public void setIpoProcess(IPOProcess ipoProcess) {
        this.ipoProcess = ipoProcess;
    }

    public List<Provider> getProviders() {
        return providers;
    }

    public void setProviders(List<Provider> providers) {
        this.providers = providers;
    }

    public List<Investor> getInvestors() {
        return investors;
    }

    public void setInvestors(List<Investor> investors) {
        this.investors = investors;
    }
}
