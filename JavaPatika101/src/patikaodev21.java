import java.util.Scanner;

public class patikaodev21 {
    public static void main(String[] args){

        int total = 1;
        int n,k,i;
        Scanner input = new Scanner(System.in);

        System.out.print("üssü Alınacak Sayıyı Giriniz:  ");
        n = input.nextInt();

        System.out.print("Kaçıncı Kuvveti?:  ");
        k =input.nextInt();

        for (i=1;i<=k;i++){

           total *= n;
        }

        System.out.println("Sonuç:  "+ total );

    }

}
