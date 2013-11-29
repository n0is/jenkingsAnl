package jenkins;

import java.util.Scanner;

/**
 *
 * @author Quentin Luc G34799
 */
public class Jenkins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb1, nb2, quit;
        quit = 0;
        System.out.println("Bienvenue dans la calculatrice !!!");
        while (quit != 1) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Entrez le premier nombre de l'addition : ");
            nb1 = keyboard.nextInt();
            System.out.print("Entrez le deuxième nombre de l'addition : ");
            nb2 = keyboard.nextInt();
            System.out.println("Résultat : " + getSomme(nb1, nb2));
            System.out.print("Quitter ? 0 1 :");
            quit = keyboard.nextInt();
        }
    }

    public static int getSomme(int a, int b) {
        return a + b;
    }

    public static int getSoustraction(int a, int b) {
        return a - b;
    }

    public static int getMultiplication(int a, int b) {
        return a * b;
    }
}
