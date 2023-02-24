public class HighschoolStudent extends Student {
    String certificate;

    public HighschoolStudent(String name, double averageGrade) {
        super(name, averageGrade);
        this.setName(name);
        this.setAverageGrade(averageGrade);
    }


    public void printStatus() {
        if (averageGrade > 85) {
            certificate = "Takdir belgesi";
        }
        else if(averageGrade > 70) {
            certificate = "Teşekkür belgesi";
        }
        else{
            certificate = "belge alamaz";
        }
        System.out.println("Öğrencinin adı: " + name + "\n100 üzerinden notu: " + averageGrade + "\nAlacağı belge: " + certificate);

    }
}
