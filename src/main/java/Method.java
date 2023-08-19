import java.util.Scanner;

public class Method {


    String hangiKahve;
    String milk;
    String seker;
    String boyut;

    Scanner input = new Scanner(System.in);




    public void hangiKahveSec() {
        System.out.println("hangi kahveyi istersiniz");
        System.out.println("Türk Kahvesi ,Filtre Kahve,Espresso");
        hangiKahve = input.nextLine().toLowerCase();




        switch (hangiKahve){
            case "türk kahvesi":
                System.out.println("Türk kahvesi hazırlanıyor");
                sutSec();
                sekerSec();
                boyutSec();
                sonuc();
                break;
            case "filtre kahve":
                System.out.println("filtre kahve hazırlanıyor");
                sutSec();
                sekerSec();
                boyutSec();
                sonuc();
                break;
            case "expresso":
                System.out.println("espresso hazırlanıyor");
                sutSec();
                sekerSec();
                boyutSec();
                sonuc();
                break;
            default:
                System.out.println("lütfen bir seçim yapınız");
        }
    }

    public void sutSec(){


        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    ");
        milk=input.next().toLowerCase();

        switch (milk){
            case "evet":
                System.out.println("Kahvenize süt ekleniyor" );
                break;
            case "hayır":
                System.out.println("Kahvenize süt eklenmiyor" );
        }
    }
    public void sekerSec(){
        System.out.println("Şeker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    ");
        seker=input.next().toLowerCase();
        if (seker.equals("evet")) {
            System.out.println("Kaç şeker olsun?");
            int kacSeker = input.nextInt();
            System.out.println(kacSeker + " şeker ekleniyor.");
        } else {
            System.out.println("Şeker eklenmiyor.");
        }
    }

    public void boyutSec(){
        System.out.println("Hangi boyutta olsun? (Büyük  - orta  - küçük  olarak giriniz.)");
        boyut=input.next().toLowerCase();

        if (boyut.equalsIgnoreCase("büyük ")){
            System.out.println("Kahveniz "+   boyut  + " hazırlanıyor.");
        }else if (boyut.equalsIgnoreCase("orta boy")) {
            System.out.println("Kahveniz  "+  boyut  +" hazırlanıyor.");
        }else if (boyut.equalsIgnoreCase("küçük boy")) {
            System.out.println("Kahveniz   " +  boyut  +"  hazırlanıyor.");
        }

    }
    public void sonuc(){
        System.out.println("Kahveniz " + boyut +" "  + "boy " +   hangiKahve + " şeklinde hazırlandı.Afiyet Olsun..." ) ;

    }
}
