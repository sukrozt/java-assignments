//bu kod verileri sağlanan öğrencinin sınıfını belirleyip gerekli bilgilerin çıktısını verir
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Kaç öğrenci kaydedilmesini istiyorsunuz?: ");
        int studentNumber = scan.nextInt(); //kullanıcıdan kodun kaç kez çalıştırılacağı verisi alınır

        for(int i = 0; i < studentNumber; i++){
            System.out.println((i+1) + ". öğrencinin sınıfı nedir?: \n1: Genel öğrenci\n2: Lise öğrencisi\n3: Üniversite öğrencisi");
            int studentClass = scan.nextInt(); //kullanıcıdan hangi case'e gidileceği ve dolayısıyla hangi sınıftan obje oluşturulacağı bilgisi alınır
            switch (studentClass) {
                case 1: {
                    System.out.println("Öğrencinin adı:"); //eğer öğrenci 'student' sınfına aitse öğrenci ismi ve notu sağlanır
                    String name = scan.next();
                    System.out.println("Öğrencinin not ortalaması:");
                    double averageGrade = scan.nextDouble();
                    Student student = new Student(name, averageGrade);
                    student.printStatus();
                    break;
                }
                case 2: {
                    System.out.println("Öğrencinin adı:"); //eğer öğrenci 'HighschoolStudent' sınfına aitse öğrenci ismi, notu ve alacağı belgenin türü sağlanır
                    String name = scan.next();
                    System.out.println("Öğrencinin not ortalaması:");
                    double averageGrade = scan.nextDouble();
                    HighschoolStudent highschoolStudent = new HighschoolStudent(name, averageGrade);
                    highschoolStudent.printStatus();
                    break;
                }
                case 3: {
                    System.out.println("Öğrencinin adı:"); //eğer öğrenci 'CollegeStudent' sınfına aitse öğrenci ismi, aldığı dersin notu ve kredisi sağlanır
                    String name = scan.next();
                    System.out.println("Öğrencinin not ortalaması:");
                    double averageGrade = scan.nextDouble();
                    System.out.println("Dersin kredisi:");
                    int credit = scan.nextInt();
                    CollegeStudent collegeStudent = new CollegeStudent(name, averageGrade, credit);
                    collegeStudent.printStatus();
                    break;
                }
                default: {
                    System.out.print("\nYanlış seçim yaptınız. Lütfen tekrar deneyin.\n");
                    i--;
                }
            }
        }
    }
}
