import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println("Operatory arytmetyczne:" + "\na = true\tb = false\tc = true");

        //AND
        System.out.println("a AND b : " + (a && b));
        System.out.println("a AND c : " + (a && c));

        //OR
        System.out.println("a OR b : " + (a || b));
        System.out.println("a OR c : " + (a || c));

        //NOT
        System.out.println("NOT a : " + !a);
        System.out.println("NOT b : " + !b);

        //łączenie operatorów
        System.out.println("NOT(a AND b) : " + !(a && b));
        System.out.println("NOT(a AND c) OR (NOT a OR b) : " + !((a && c) || (!a || b)));
        System.out.println("a OR (NOT c) AND c AND (NOT b) : " + ((a || !c) || (c && !b)));


        System.out.println();

        /* Operatory porównania */
        int x = 5;
        int y = 7;
        int z = 5;

        /* \t - dodaje tabulator, \n - przeżuca kursor na początek nowej linii */
        System.out.printf("Operatory porównania:" +
                "\nx = %d\ty = %d\tz = %d\n", x, y, z);

        /* porównanie */
        System.out.println("(x == y) : " + (x == y)); // false
        System.out.println("(x == z) : " + (x == z)); // true

        /* nierówne */
        System.out.println("(x != y) : " + (x != y)); // true
        System.out.println("(x != z) : " + (x != z)); // false

        /* pozostałe operatory */
        System.out.println("(x > y) : " + (x > y)); // false
        System.out.println("(x < y) : " + (x < y)); // true
        System.out.println("(y >= x) : " + (y >= x)); // true

        System.out.println("((x > y) || (a && b)) : " + ((x > y) || (a && b)));
        System.out.println("((y > x) || (a || c)) : " + ((y > x) || (a || c)));

    }
}
