package Ejercicio3;

public class Investor {
    private String investorId;
    private String investorName;
    private double investmentAmount;

    public Investor(String investorId, String investorName, double investmentAmount) {
        this.investorId = investorId;
        this.investorName = investorName;
        this.investmentAmount = investmentAmount;
    }

    public String getInvestorId() {
        return investorId;
    }

    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }

    public double getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(double investmentAmount) {
        this.investmentAmount = investmentAmount;
    }
}
