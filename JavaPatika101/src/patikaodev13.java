import java.util.Scanner;

public class patikaodev13 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int month,day;
        String burc = "";
        boolean hata = false;

        // Boolean'ı çalıştıramadım, o yüzden hatalı gün kontrolünü "if" ile yaptım.

        System.out.print("Doğduğunuz Ay: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz Gün: ");
        day = input.nextInt();



        if (month == 1){
            if (day >= 1 && day <= 31){
                if(day < 22){
                    burc = "Oğlak";

                }else{ burc = "Kova";

                }
            }else{
                hata = true;
        }



        }if (month == 2){
            if(day >= 1 && day <= 28){
                if (day < 20) {
                    burc = "Kova";
                }else{
                    burc = "Balık";
                }
            }
        }else{
            hata = true;




        }if (month == 3){
            if(day >= 1 && day <= 31){
                if(day < 20){
                    burc = "Balık";
                }else{
                    burc = "Koç";
                }
            }
        }else{
            hata = true;



        }if (month == 4){
            if(day >= 1 && day <=30){
                if(day < 21){
                    burc = "Koç";
                }else {
                    burc = "Boğa";
                }
            }
        }else{
            hata = true;





        }if (month == 5){
            if (day >= 1 && day <= 31){
                if(day < 21){
                    burc = "Boğa";
                }else{
                    burc = "ikizler";
                }
            }
        }else {
            hata = true;




        }if (month == 6){
            if (day >= 1 && day <= 30){
                if (day < 23){
                    burc = "İkizler";
                }else{
                    burc = "Yengeç";
                }
            }
        }else{
            hata = true;




        }if (month == 7){
            if (day >= 1 && day <= 31){
                if(day < 22){
                    burc = "Yengeç";
                }else{
                    burc = "Aslan";
                }
            }
        }else{
            hata = true;





        }if (month == 8){
            if (day >= 1 && day <= 31){
                if (day < 22){
                    burc = "Aslan";
                }else {
                    burc = "Başak";
                }
            }
        }else{
            hata = true;




        }if(month == 9){
            if (day >= 1 && day <= 30){
                if(day <22){
                    burc = "Başak";
                }else{
                    burc = "Terazi";
                }
            }
        }else {
            hata = true;




        }if(month == 10){
            if(day >= 1 && day <= 31){
                if(day < 22){
                    burc = "Terazi";
                }else{
                    burc = "Akrep";
                }
            }
        }else{
            hata = true;





        }if(month == 11){
            if(day >= 1 && day <= 30){
                if (day < 21){
                    burc = "Akrep";
                }else{
                    burc = "Yay";
                }
            }
        }else{
            hata = true;




        }if (month == 12){
            if(day >= 1 && day <= 31){
                if (day < 21){
                    burc = "Yay";
                }else{
                    burc = "Oğlak";
                }
            }
        }else {
            hata = true;
        }




        if(day >=32){
            System.out.println("Geçersiz bir değer girdiniz");
            }if(month >= 13) {
            System.out.println("Geçersiz bir değer girdiniz");
            }else{
            System.out.println("Burcunuz: " + burc);
        }

    }
}
