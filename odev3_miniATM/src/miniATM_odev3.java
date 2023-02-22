//bu kod küçük bir atm uygulaması. para çekme, para yatırma, bakiye görüntüleme olmak üzere 3 fonksiyonu, 1 adet de çıkış komutu var.
import java.util.Scanner;

public class miniATM_odev3 {
    public static void main(String[] args) {
        boolean is_this_exit = true;
        while(is_this_exit){
            int ilk_bakiye = 5000;
            Scanner scan = new Scanner(System.in);
            System.out.println("\nYapmak istediğiniz işlemi giriniz: \n1 : bakiye görüntüleme\n2 : para çekme\n3 : para yatırma\n4 : sistemden çıkış");
            int input_user = scan.nextInt(); //kullanıcıdan hangi işlemin yapılacağı alınıyor
            switch(input_user){
                case 1:{ //1: bakiye görüntüleme
                    System.out.print("\nMevcut bakiyeniz: " + ilk_bakiye + "TL\n");
                    break;
                }
                case 2:{ //2: para çekme
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
                case 3:{ //3: para yatırma
                    System.out.print("\nYatırmak istediğiniz tutarı giriniz: ");
                    int yatirilan_para = scan.nextInt();
                    System.out.println("\nİşlem başarılı");
                    break;
                }
                case 4:{ //4: çıkış yapma. sistemden çıkış yapılana kadar sistem tekrardan hangi işlemin yapılacağını sorar.
                    System.out.print("\nSistemden çıkış yapıldı. İyi günler dileriz.\n");
                    is_this_exit = false; //is_this_exit boolean değişkeni sayesinde sistemden çıkış yapılıp yapılmadığını anlıyorum
                    break;
                }
                default :{ //1-2-3-4 komutları dışında bir karakter girildiğinde uygulama tekrar komut sorar.
                    System.out.print("\nGeçersiz komut girdiniz. Lütfen tekrar deneyin.\n");
                }
            }
        }

    }
}
