import java.util.Scanner;

public class patikaodev16 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int yil;

        System.out.print("Yılı Giriniz:  ");
        yil = input.nextInt();

        if (yil % 4 == 0 && yil % 100 != 0) {
            System.out.println( "Artık Yıl");
        }else if (yil % 400 == 0){
            System.out.println("Artık Yıl");

        }else{
            System.out.println("Artık Yıl Değil");
        }
    }
}
