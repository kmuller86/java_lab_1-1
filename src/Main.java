import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */
        byte zmien1 = 2;
        short zmien2 = 23;
        int zmien3 = 3333;
        long zmien4 = 33333333;
        float zmien5 = 33.33f;
        double zmien6 = 1212.1212;
        boolean zmienbol = true;
        char zmienchar = 'w';
        String hehe = "ehehe";
        System.out.println("zmienna zmien1 = " + zmien1);
        System.out.println("zmienna zmien2 = " + zmien2);
        System.out.println("zmienna zmien3 = " + zmien3);
        System.out.println("zmienna zmien4 = " + zmien4);
        System.out.println("zmienna zmien5 = " + zmien5);
        System.out.println("zmienna zmien6 = " + zmien6);
        System.out.println("zmienna boolean = " + zmienbol);
        System.out.println("zmienna char = " + zmienchar);
        System.out.println("string hehe = " + hehe);
        int liczbaA = 25;
        int liczbaB = 37;
        double liczbaX = 37.37;
        double liczbaY = 25.25;
        int dodawanie = liczbaA + liczbaB;
        double dodawanie1 = liczbaY + liczbaX;
        int odejmowanie = liczbaA - liczbaB;
        double odejmowanie1 = liczbaX - liczbaY;
        int mnozenie = liczbaA * liczbaB;
        double mnozenie1 = liczbaX * liczbaY;
        int dzielenie = liczbaA / liczbaB;
        double dzielenie1 = liczbaX / liczbaY;
        int reszta = liczbaA % liczbaB;
        double reszta1 = liczbaX % liczbaY;
    }
}
