public class CollegeStudent extends Student {
    int earnedCredits;

    public CollegeStudent(String name, double studentGrade, int credits) {
        super(name, studentGrade);
        this.setName(name);
        this.setAverageGrade(studentGrade);
        this.setEarnedCredits(credits);
    }

    public void printStatus() {
        double grade4 = averageGrade * 4 / 100;
        double gradeofCourse = grade4 * credits
        System.out.println("Ogrenci ismi: " + this.name + "\nDersin puani: " + gradeofCourse);

    }

    public int getEarnedCredits() {
        return earnedCredits;
    }

    public void setEarnedCredits(int earnedCredits) {
        this.earnedCredits = earnedCredits;
    }
}
