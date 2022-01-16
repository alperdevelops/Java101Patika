import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        // Değişkenleri oluştur.
        int mat, fizik, kimya, turkce, tarih, muzik;


        //Scanner sınıfımızı oluşturduk.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();


        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();


        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();


        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();


        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();


        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.00;


        boolean durum1 = (sonuc >= 60);

        boolean sinif  = (durum1);


        System.out.println("Ortalamanız : " + sonuc);

        String str = sinif ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(str);

    }

}
