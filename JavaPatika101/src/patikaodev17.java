import java.util.Scanner;

public class patikaodev17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int k;
        int o=0, t, a=0;
        int average;
        int sonuc = 0;


        System.out.print("Bir Sayı Giriniz:  ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
                a++;

            }else if (i % 4 == 0) {
                System.out.println(i);
                o++;
            }

        }
            System.out.println("3 ve 4 e Tam Bölünen Ortalaması" + (k/a + o ));
    }

    }

