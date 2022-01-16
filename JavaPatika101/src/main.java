import java.util.Scanner;

    public class main {
        public static void main(String[] args) {

            double kdvOrani1, kdvOrani2,  paraDegeri;
            kdvOrani1 = (1.18);
            kdvOrani2 = (1.08);

            Scanner inp = new Scanner(System.in);

            System.out.print("Miktar: ");
            paraDegeri = inp.nextInt();



            double KdvHesabi1 = (paraDegeri * kdvOrani1);
            double KdvHesabi2 = (paraDegeri * kdvOrani2);
            double KDVTutari1 = (KdvHesabi1 - paraDegeri);
            double KDVTutari2 = (KdvHesabi2 - paraDegeri);



            if (paraDegeri < 1000){
            System.out.println("KDV'li Fiyatı: " + KdvHesabi1);
                System.out.println("KDV Tutarı : " + KDVTutari1);
                System.out.println("KDV'siz Fiyat : " + paraDegeri);
                System.out.println("KDV Orani : " + kdvOrani1);
            }

            if (paraDegeri >= 1000){
                System.out.print("KDV'li Fiyatı: " + KdvHesabi2);
                System.out.println("KDV Tutarı : " + KDVTutari2);
                System.out.println("KDV'siz Fiyat : " + paraDegeri);
                System.out.println("KDV Orani : " + kdvOrani2);
            }





            System.out.println();




        }


}
