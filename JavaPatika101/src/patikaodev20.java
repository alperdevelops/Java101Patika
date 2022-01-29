import java.util.Scanner;

public class patikaodev20 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("N Kümesi için Sayıyı Giriniz:  ");
        int zn = input.nextInt();
        System.out.print("R Kümesi için Sayıyı Giriniz:   ");
        int zr = input.nextInt();
        int totalR = 1;
        int n = 1;
        int r = 1;
        int totalN = 1;
        int f = 1;
        int totalf = 1;



        while (n<=zn){
            System.out.println(n);
            totalN = totalN * n;
            n++;
        }
        System.out.println("------------N Faktöriyel: " + totalN);



        while (r<=zr){
            System.out.println(r);
            totalR = totalR * r;
            r++;
        }
        System.out.println("------------R Faktöriyel: " + totalR);


        while (n <= zn && r <= zr){
            System.out.println(f);
            totalf = totalf * f;
            f++;
        }
        int Combination = totalN / (totalR * (zn - zr * f));
        System.out.println("------------C (n,r) Kombinasyonu:    " + Combination);



    }
}
