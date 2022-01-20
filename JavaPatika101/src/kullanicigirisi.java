import java.security.KeyStore;
import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args){

        String userName,password,yeniSifre,cevap;
        Boolean Evet=true, Hayir=false;



        Scanner inp = new Scanner(System.in);


        System.out.print("Kullanıcı adını giriniz: ");
        userName = inp.nextLine();


        System.out.print("Şifrenizi giriniz: ");
        password = inp.nextLine();


        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız! ");
        }else {
            System.out.println("Kullanıcı adı veya Şifreniz hatalı!!! ");


            System.out.println("Yeni şifre almak ister misiniz?  (Evet) veya (Hayir) olarak cevaplayınız. ");
             cevap = inp.nextLine();
            cevap = (Evet) ? "Yeni şifrenizi giriniz:" : "Programı kapatabilirsiniz.";

            System.out.println("Yeni şifrenizi giriniz: ");
            yeniSifre = inp.nextLine();
            if (yeniSifre.equals("java123")){
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre deneyiniz... ");
            }else{
                System.out.println("Yeni şifre oluşturuldu...");
            }

        }
      }
     }



