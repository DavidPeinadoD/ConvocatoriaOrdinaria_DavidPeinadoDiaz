package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String employeeId;
    private String employeeName;
    private List<SubjectGrade> subjectGrades;
    private List<Certificate> certificates;

    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.subjectGrades = new ArrayList<>();
        this.certificates = new ArrayList<>();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<SubjectGrade> getSubjectGrades() {
        return subjectGrades;
    }

    public void setSubjectGrades(List<SubjectGrade> subjectGrades) {
        this.subjectGrades = subjectGrades;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public double calculateAverageGrade() {
        double sum = 0.0;
        int count = 0;
        for (SubjectGrade grade : subjectGrades) {
            sum += grade.getGrade();
            count++;
        }
        return count > 0 ? sum / count : 0.0;
    }

    public void enrollCourse(Course course) {
        // Lógica para inscribir a un curso
    }

    public void registerGrade(Subject subject, double grade) {
        // Lógica para registrar la nota de una asignatura
    }

    public void acquireCertificate(Certificate certificate) {
        // Lógica para adquirir un certificado
    }
}