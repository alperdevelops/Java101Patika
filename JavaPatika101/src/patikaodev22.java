import java.util.Scanner;

public class patikaodev22 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz: " );
        int  number = input.nextInt();
        int a,b,c,d;

        a = number-((number/10)*10);

        number=number/10;

        b = number-((number/10)*10);

        number=number/10;

        c = number-((number/10)*10);

        number=number/10;

        d = number;

        System.out.println( a + b + c + d );

         /*
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;



        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber !=0) {
                basValue = tempNumber % 10;
                basPow = 1;
            for (int i = 1; i <= basNumber; i++){
                basPow *= basValue;
            }

            result += basPow;
            tempNumber /= 10;

        }
        if (result == number){
            System.out.println(number + " sayisi bir Armstrong Sayidir!");


        }else{
            System.out.println(number + " sayisi bir Armstrong sayi degildir!!");
        }

         */


    }
}