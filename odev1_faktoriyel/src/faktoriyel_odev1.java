import java.util.Scanner;
public class faktoriyel_odev1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayı girin: ");
        int sayi1 = scan.nextInt();
        System.out.println(sayi1);
        int toplam = 1;
        while(sayi1 > 1){
            toplam = toplam * (sayi1--);
        }
        System.out.println("Faktöriyel sonucu: " + toplam);
    }
}