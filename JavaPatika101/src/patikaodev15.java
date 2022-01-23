import java.util.Scanner;

public class patikaodev15 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int zodyak;
        int dYili;

        System.out.print("Doğum Yılınızı Giriniz:  ");
        dYili = input.nextInt();

        zodyak = (dYili % 12);

        switch (zodyak){

            case 0:
                System.out.println("Maymun Yılı");
                break;

            case 1:
                System.out.println("Horoz Yılı");
                break;

            case 2:
                System.out.println("Köpek Yılı");
                break;

            case 3:
                System.out.println("Domuz Yılı");
                break;

            case 4:
                System.out.println("Fare Yılı");
                break;

            case 5:
                System.out.println("Öküz Yılı");
                break;

            case 6:
                System.out.println("Kaplan Yılı");
                break;

            case 7:
                System.out.println("Tavşan Yılı");
                break;

            case 8:
                System.out.println("Ejderha Yılı");
                break;

            case 9:
                System.out.println("Yılan Yılı");
                break;

            case 10:
                System.out.println("At Yılı");
                break;

            case 11:
                System.out.println("Koyun Yılı");
                break;

        }
    }
}
