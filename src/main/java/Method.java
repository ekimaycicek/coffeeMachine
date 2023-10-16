import java.util.Scanner;

public class Method {


    String whichCoffee;
    String milk;
    String sugar;
    String dimension;

    Scanner input = new Scanner(System.in);




    public void chooseWhichCoffee() {
        System.out.println("Which coffee would you like?");
        System.out.println("Turkish Coffee, Filter Coffee, Espresso");
        whichCoffee = input.nextLine().toLowerCase();




        switch (whichCoffee){
            case "Turkish Coffee":
                System.out.println("Turkish coffee being prepared");
                selectMilk();
                selectSugar();
                chooseSize();
                result();
                break;
            case "filter coffee":
                System.out.println("Preparing filter coffee");
                selectMilk();
                selectSugar();
                chooseSize();
                result();
                break;
            case "expresso":
                System.out.println("preparing expresso");
                selectMilk();
                selectSugar();
                chooseSize();
                result();
                break;
            default:
                System.out.println("please make a choice");
        }
    }

    public void selectMilk(){


        System.out.println("Would you like us to add milk? (Answer Yes or No):    ");
        milk=input.next().toLowerCase();

        switch (milk){
            case "yes":
                System.out.println("Adding milk to your coffee" );
                break;
            case "no":
                System.out.println("No milk added to your coffee" );
        }
    }
    public void selectSugar(){
        System.out.println("Would you like us to add sugar? (Answer Yes or No):    ");
        sugar=input.next().toLowerCase();
        if (sugar.equals("yes")) {
            System.out.println("how much sugar?");
            int howMuchSugar = input.nextInt();
            System.out.println(howMuchSugar + " sugar is added.");
        } else {
            System.out.println("No sugar is added.");
        }
    }

    public void chooseSize(){
        System.out.println("What size would it be? (Enter large - medium - small.)");
        dimension=input.next().toLowerCase();

        if (dimension.equalsIgnoreCase("large size ")){
            System.out.println("your coffee "+   dimension  + " getting ready.");
        }else if (dimension.equalsIgnoreCase("medium size")) {
            System.out.println("your coffee  "+  dimension  +" getting ready.");
        }else if (dimension.equalsIgnoreCase("Small-sized")) {
            System.out.println("your coffee   " +  dimension  +"  getting ready.");
        }





    }
    public void result(){
        System.out.println("your coffee " + dimension +" "  + "size " +   whichCoffee + " prepared in the form.Enjoy your meal..." ) ;

    }
}
