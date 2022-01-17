import java.util.Scanner;

public class vkendeksi {
    public static void main(String[] args){

        double boy;
        double kilo;


        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu (metre) cinsinden yazınız: ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu yazınız: ");
        kilo = input.nextDouble();

        double vucutkendeksi = ( kilo / Math.pow(boy,boy));

        System.out.println("Boyunuz: " + boy);

        System.out.println("Kilonuz: " + kilo);

        System.out.println("Vücut Kitle İndeksiniz: " + vucutkendeksi);




    }

}
