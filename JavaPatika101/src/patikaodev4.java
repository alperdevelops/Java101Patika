import java.util.Scanner;

public class patikaodev4 {
    public static void main(String[] args) {
        int km;
        double kmBasi = 2.20;
        double acilis = 10.0;
        double toplamtutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen Yol: ");
        km = input.nextInt();

        toplamtutar = (kmBasi * km + acilis);

        toplamtutar = (toplamtutar < 20) ? 20 : toplamtutar;
        System.out.println("Taksimetre Ücreti: " + toplamtutar);


    }
}
