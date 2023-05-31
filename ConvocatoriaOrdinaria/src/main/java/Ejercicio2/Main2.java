package Ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        // Crear cursos
        Course course1 = new Course("C1", "Curso 1");
        Course course2 = new Course("C2", "Curso 2");

        // Crear asignaturas
        Subject subject1 = new Subject("S1", "Asignatura 1");
        Subject subject2 = new Subject("S2", "Asignatura 2");

        // Crear empleados
        Employee employee1 = new Employee("E1", "Empleado 1");
        Employee employee2 = new Employee("E2", "Empleado 2");

        // Inscribir empleados a cursos
        employee1.enrollCourse(course1);
        employee2.enrollCourse(course2);

        // Registrar notas de empleados en asignaturas
        employee1.registerGrade(subject1, 8.5);
        employee1.registerGrade(subject2, 7.0);
        employee2.registerGrade(subject1, 9.0);

        // Adquirir certificados
        Certificate certificate1 = new Certificate("Cert1", "Certificado 1");
        Certificate certificate2 = new Certificate("Cert2", "Certificado 2");

        employee1.acquireCertificate(certificate1);
        employee2.acquireCertificate(certificate2);

        // Obtener promedio académico de empleados
        double averageGrade1 = employee1.calculateAverageGrade();
        double averageGrade2 = employee2.calculateAverageGrade();

        // Imprimir resultados
        System.out.println("Promedio académico de " + employee1.getEmployeeName() + ": " + averageGrade1);
        System.out.println("Promedio académico de " + employee2.getEmployeeName() + ": " + averageGrade2);

        // Imprimir certificados de empleados
        System.out.println("Certificados de " + employee1.getEmployeeName() + ":");
        for (Certificate certificate : employee1.getCertificates()) {
            System.out.println(certificate.getCertificateName());
        }

        System.out.println("Certificados de " + employee2.getEmployeeName() + ":");
        for (Certificate certificate : employee2.getCertificates()) {
            System.out.println(certificate.getCertificateName());
        }
    }
}
