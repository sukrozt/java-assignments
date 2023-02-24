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
        System.out.println("Ogrenci ismi: " + this.name + "\nOgrencinin 4 uzerinden notu: " + grade4 + "\nDersin kredisi: "+ earnedCredits);

    }

    public int getEarnedCredits() {
        return earnedCredits;
    }

    public void setEarnedCredits(int earnedCredits) {
        this.earnedCredits = earnedCredits;
    }
}
