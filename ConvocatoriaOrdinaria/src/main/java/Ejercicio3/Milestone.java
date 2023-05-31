package Ejercicio3;

public class Milestone {
    private String milestoneId;
    private String milestoneName;
    private String milestoneStatus;

    public Milestone(String milestoneId, String milestoneName, String milestoneStatus) {
        this.milestoneId = milestoneId;
        this.milestoneName = milestoneName;
        this.milestoneStatus = milestoneStatus;
    }

    public String getMilestoneId() {
        return milestoneId;
    }

    public void setMilestoneId(String milestoneId) {
        this.milestoneId = milestoneId;
    }

    public String getMilestoneName() {
        return milestoneName;
    }

    public void setMilestoneName(String milestoneName) {
        this.milestoneName = milestoneName;
    }

    public String getMilestoneStatus() {
        return milestoneStatus;
    }

    public void setMilestoneStatus(String milestoneStatus) {
        this.milestoneStatus = milestoneStatus;
    }
}
