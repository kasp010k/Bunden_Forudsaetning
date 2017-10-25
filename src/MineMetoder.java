//Brugte metoder som vi havde arbejdet med tidligere i semesteret og genbrugte opgaver vi har lavet. Håber det er i orden at jeg ikke begyndte at genopdage den dybe tallerken.

//Import af funktionerne "Random" og "Scanner".
import java.util.Random;
import java.util.Scanner;

public class MineMetoder {

    //no-arg constructor.
    public MineMetoder() {

    }

    //Metode til brug af Enum.
    public enum Card {
        Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    }
    //Hent kort til brug i sidste printoutline.
    public void getCard(){

        //Print kortet "Nine"
        System.out.println(Card.Nine);
    }

    //getWhile metode til at udskrive alle tal mellem 0 og 10.
    void getWhile() {

        //Sætter starten ved 0.
        int i = 0;
        //Der ligges 1 til start tallet og tallene bliver printet indtil vi når til 10.
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

    }

    //getFor metode til at udskrive alle tal mellem 1 og 10.
    void getFor()  {

        //Samme princip som i metoden ovenover, bare kodet en smule anderledes med getFor i stedet for getWhile.
        for (int i = 0; i <= 10; i++)   {
            System.out.print(i + " ");
        }

    }

    //getRandom metode til at printe et tilfældigt tal mellem 0 og 10
    void getRandom()    {

        Random random = new Random();
        System.out.println(random.nextInt(11));

    }

    //Laver en getScanner void metode der lader
    void getScanner()   {

        System.out.println("Vælg Radius");

        //Scanneren lader brugeren vælge et tal, "Double" gør at det kan være komma tal og ikke kun lige tal.
        Scanner input = new Scanner(System.in);
        double radius =input.nextDouble();
        System.out.println("Radius er "+radius);

        //Udregning foregår og resultatet printes.
        double resultat = radius * radius * 3.14;
        System.out.println (radius + "*" + radius + "*3.14");
        System.out.println("Arealet er " + resultat);

    }

}










