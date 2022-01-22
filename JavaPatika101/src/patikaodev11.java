import java.util.Scanner;

public class patikaodev11 {
    public static void main(String[] args) {

        int heat;
        int aktivite = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı Giriniz: ");
        heat = input.nextInt();

       /* Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.*/


        if (heat <5){
            aktivite = 1;
            // System.out.println("Kayak yapabilirsiniz. ");
        }if(heat >=5 && heat <= 15){
            aktivite = 2;
            // System.out.println("Sinemaya gidebilirsiniz. ");
        }if(heat >= 15 && heat <= 25){
            aktivite = 3;
            //  System.out.println("Pikniğe gidebilirsiniz.");
        }if(heat >= 25){
            aktivite = 4;
            //  System.out.println("Yüzmeye gidebilirsiniz");
        }else {

            System.out.println("");
        }

        switch (aktivite){
            case 1:
                System.out.println("Kayak yapabilirsiniz.");
                break;

            case 2:
                System.out.println("Sinemaya gidebilirsiniz.");
                break;

            case 3:
                System.out.println("Pikniğe gidebilirsiniz.");
                break;

            case 4:
                System.out.println("Yüzmeye gidebilirsiniz.");
                break;}

    }

}
