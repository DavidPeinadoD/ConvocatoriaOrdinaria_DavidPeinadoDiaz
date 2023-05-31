package Ejercicio2;

class SubjectGrade {
    private Subject subject;
    private double grade;

    public SubjectGrade(Subject subject, double grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}