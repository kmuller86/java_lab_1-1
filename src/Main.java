import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imie:");
        String imie = scan.next();
        System.out.print("Podaj nazwisko:");
        String nazwisko = scan.next();
        System.out.print("Podaj wiek:");
        int wiek = scan.nextInt();
        System.out.print("Podaj numer indeksu:");
        int nrindex = scan.nextInt();
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.printf("Twój wiek to %d i numer indeksu to %d \n", + wiek, nrindex);

        int A = 2333;
        int B = 34;
        System.out.println("wynik dodawania zmiennej a i b wynosi: " + (A+B));
        System.out.println("wynik odejmowania zmiennej a i b wynosi: " + (A-B));
        System.out.println("wynik mnożenia zmiennej a i b wynosi: " + (A*B));
        System.out.println("wynik dzielenia zmiennej a i b wynosi: " + (A/B));
        System.out.println("wynik dzielenia z resztą zmiennej a i b wynosi: "+ (A%B));
    }
}
