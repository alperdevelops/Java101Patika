import java.util.Scanner;

public class patıkaodev23 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("N Sayisini Giriniz:  ");
        int n = input.nextInt();
        double result = 0.0;

        for (double i = 1; i <= n ; i++){
            result += (1 / i);

        }
        System.out.println(result);
    }
}
