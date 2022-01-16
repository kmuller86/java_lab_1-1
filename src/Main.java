import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        int[] tablica = new int[5];
        for (int i = 0; i < 5; i++)
        // po co typuje pan i na int skoro on jest intem?
            tablica [(int) i] = i +1;
        for (int i = 0; i < 5; i++)
            System.out.println("Następna komórka to: " + tablica[i]);
        
        /*
        pan stworzył tablicę int a nie double
        powinno byc:
        double[] tabDouble = new double[5];
        for(int i=0; i<tabDouble.length; i++) {
        tabDouble[i] = i + 0.2 // wartosc dowolna
        }
        
        */
    }
}
