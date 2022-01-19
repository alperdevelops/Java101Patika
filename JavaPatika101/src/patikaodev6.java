import java.util.Scanner;

public class patikaodev6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        double agirlik, agirlik1, agirlik2, agirlik3, agirlik4, agirlik5;
        double armuttl , elmatl, domatestl, muztl, patlicantl;

        System.out.print("Armut Kaç Kg? : ");
        agirlik1 = input.nextDouble();
        armuttl = (armut * agirlik1);


        System.out.print("Elma Kaç Kg? : ");
        agirlik2 = input.nextDouble();
        elmatl = (elma * agirlik2);

        System.out.print("Domates Kaç Kg? : ");
        agirlik3 = input.nextDouble();
        domatestl = (domates * agirlik3);

        System.out.print("Muz Kaç Kg? : ");
        agirlik4 = input.nextDouble();
        muztl = (muz * agirlik4);

        System.out.print("Patlıcan Kaç Kg? : ");
        agirlik5 = input.nextDouble();
        patlicantl = (patlican * agirlik5);



        double toplamtutar = (armuttl + elmatl + domatestl + muztl + patlicantl);

        System.out.println("Toplam Tutar : " + toplamtutar +   " TL");




    }



}
