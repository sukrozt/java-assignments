import java.util.Scanner;

public class miniATM_odev3 {
    public static void main(String[] args) {
        boolean is_this_exit = true;
        while(is_this_exit){
            int ilk_bakiye = 5000;
            Scanner scan = new Scanner(System.in);
            System.out.println("\nYapmak istediğiniz işlemi giriniz: \n1 : bakiye görüntüleme\n2 : para çekme\n3 : para yatırma\n4 : sistemden çıkış");
            int input_user = scan.nextInt();
            switch(input_user){
                case 1:{
                    System.out.print("\nMevcut bakiyeniz: " + ilk_bakiye + "TL\n");
                    break;
                }
                case 2:{
                    System.out.print("\nÇekmek istediğiniz tutarı giriniz: ");
                    int cekilen_para = scan.nextInt();
                    if (cekilen_para > ilk_bakiye){
                        System.out.println("\nHata: Bakiyenizden yüksek miktarda tutar girdiniz.");
                    }
                    else{
                        System.out.println("\nİşlem başarılı");
                    }
                    break;
                }
                case 3:{
                    System.out.print("\nYatırmak istediğiniz tutarı giriniz: ");
                    int yatirilan_para = scan.nextInt();
                    System.out.println("\nİşlem başarılı");
                    break;
                }
                case 4:{
                    System.out.print("\nSistemden çıkış yapıldı. İyi günler dileriz.\n");
                    is_this_exit = false;
                    break;
                }
                default :{
                    System.out.print("\nGeçersiz komut girdiniz. Lütfen tekrar deneyin.\n");
                }
            }
        }

    }
}