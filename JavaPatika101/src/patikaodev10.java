import java.util.Scanner;

public class patikaodev10 {
    public static void main(String[] args){

       int mat,fiz,turkce,kim,muz;
       int sayac = 0;
       int toplam = 0;




        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Ders Notunuz: ");
        mat = input.nextInt();
        if (mat <= 0 )  {
            System.out.println("Notunuz 0,ortalama dışı.");
            }else if (mat >= 100) {
            System.out.println("Notunuz 100,ortalama dışı. ");}

        else {System.out.println("Matematik notunuz eklendi");
            sayac++;
            toplam += mat;
        }



        System.out.print("Fizik Ders Notunuz: ");
        fiz = input.nextInt();
        if (fiz <= 0) {
            System.out.println("Notunuz 0,ortalama dışı.");
            }else if (fiz >= 100) {
            System.out.println("Notunuz 100,ortalama dışı. ");}

        else  {System.out.println("Fizik notunuz eklendi");
            sayac++;
            toplam += fiz;
        }


        System.out.print("Türkçe Ders Notunuz: ");
        turkce = input.nextInt();
        if (turkce <= 0) {
            System.out.println("Notunuz 0,ortalama dışı.");
            }else if (turkce >= 100) {
            System.out.println("Notunuz 100,ortalama dışı. ");}

        else  {System.out.println("Türkçe notunuz eklendi");
            sayac++;
            toplam += turkce;
        }


        System.out.print("Kimya Ders Notunuz: ");
        kim = input.nextInt();
        if (kim <= 0) {
            System.out.println("Notunuz 0,ortalama dışı.");
            }else if (kim >= 100) {
            System.out.println("Notunuz 100,ortalama dışı. ");}

        else  {System.out.println("Kimya notunuz eklendi");
            sayac++;
            toplam += kim;
        }


        System.out.print("Müzik Ders Notunuz: ");
        muz = input.nextInt();
        if (muz <= 0) {
            System.out.println("Notunuz 0,ortalama dışı.");
            }else if (muz >= 100) {
            System.out.println("Notunuz 100,ortalama dışı. ");}

        else  {System.out.println("Müzik notunuz eklendi");
            sayac++;
            toplam += muz;
        }




        double average = ( (toplam) / (sayac) );
        if (average <= 55 ){
            System.out.println("Sınıf tekrarı, seneye görüşürüz. ");
            }else{
            System.out.println("Tebrikler Sınıfı Geçtiniz!! ");
        }

        System.out.println("Not Ortalamız  " + average);

    }
}


