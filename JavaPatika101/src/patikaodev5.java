import java.util.Scanner;

public class patikaodev5 {
    public static void main(String[] args){

        int ryaricap;
        double pi = 3.14;
        double a;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarı Çapı Giriniz: ");
        ryaricap = input.nextInt();

        System.out.print("A Açısını Giriniz: ");
        a = input.nextInt();

        double dairealan = (pi * ryaricap * ryaricap);
        double dairecevre = (2 * pi * ryaricap);
        double dairenindilimi = (pi * ryaricap * ryaricap * a /180);

        System.out.println("Dairenin Alanı: " + dairealan);

        System.out.println("Dairenin Çevresi: " + dairecevre);

        System.out.println("Dairenin Taralı Alanı: "+ dairenindilimi );




    }

}
