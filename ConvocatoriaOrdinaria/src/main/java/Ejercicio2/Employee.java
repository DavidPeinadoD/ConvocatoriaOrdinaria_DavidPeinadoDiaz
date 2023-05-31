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
        // Verificar si el empleado ya está inscrito en el curso
        for (SubjectGrade subjectGrade : subjectGrades) {
            if (subjectGrade.getSubject().getSubjectId().equals(course.getCourseId())) {
                System.out.println("El empleado ya está inscrito en este curso.");
                return;
            }
        }

        // Inscribir al empleado en el curso
        Subject subject = new Subject(course.getCourseId(), course.getCourseName());
        subjectGrades.add(new SubjectGrade(subject, 0.0));
        System.out.println("El empleado ha sido inscrito en el curso: " + course.getCourseName());
    }



    public void registerGrade(Subject subject, double grade) {
        // Verificar si el empleado está inscrito en la asignatura
        boolean isEnrolled = false;
        for (SubjectGrade subjectGrade : subjectGrades) {
            if (subjectGrade.getSubject().equals(subject)) {
                subjectGrade.setGrade(grade);
                isEnrolled = true;
                break;
            }
        }

        if (isEnrolled) {
            System.out.println("Se ha registrado la nota de la asignatura: " + subject.getSubjectName());
        } else {
            System.out.println("El empleado no está inscrito en la asignatura: " + subject.getSubjectName());
        }
    }

    public void acquireCertificate(Certificate certificate) {
        // Verificar si el empleado ya ha adquirido el certificado
        for (Certificate cert : certificates) {
            if (cert.equals(certificate)) {
                System.out.println("El empleado ya ha adquirido este certificado.");
                return;
            }
        }

        // Adquirir el certificado
        certificates.add(certificate);
        System.out.println("El empleado ha adquirido el certificado: " + certificate.getCertificateName());
    }

}