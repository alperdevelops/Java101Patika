import java.util.Scanner;

public class patikaodev19 {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz: ");
        n = input.nextInt();
        
        i=1;
        j=1;

        while (i<=n & j<=n){
            System.out.println(i);
            i*=4;

            System.out.println(j);
            j*=5;
        }

    }
}



















