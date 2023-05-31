package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class IPOProcess {
    private List<Milestone> milestones;

    public IPOProcess() {
        milestones = new ArrayList<>();
    }

    public void addMilestone(Milestone milestone) {
        milestones.add(milestone);
    }

    public void removeMilestone(Milestone milestone) {
        milestones.remove(milestone);
    }

    public List<Milestone> getMilestones() {
        return milestones;
    }

    public void setMilestones(List<Milestone> milestones) {
        this.milestones = milestones;
    }
}
