import java.util.Scanner;

public class Student {
    String name;
    double averageGrade;

    public Student(String studentName, double studentGrade) {
        this.setName(studentName);
        this.setAverageGrade(studentGrade);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverageGrade(double averageGrade) {
        if (averageGrade > 0 && averageGrade < 100) {
            this.averageGrade = averageGrade;
        } else {
            System.out.println("Girilen not 0-100 arasında olmalıdır.");
        }
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public String getName() {
        return name;
    }

    public void printStatus() {
        System.out.println("Öğrenci ismi: " + name + "\nÖğrencinin 100 üzerinden notu: " + averageGrade);

    }
}