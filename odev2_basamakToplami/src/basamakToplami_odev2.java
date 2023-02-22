import java.util.Scanner;

public class basamakToplami_odev2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int sayi = scan.nextInt();
        int toplam = 0;
        while(sayi>0){
            int basamak = sayi % 10;
            sayi = sayi / 10;
            toplam = toplam + basamak;
        }
        System.out.print("Sayının rakamları toplamı: " + toplam);
    }
}