package dz.univ.calculatrice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operation add = new AddOperation();
        Operation sub = new SubtractOperation();

        System.out.println("=== Calculatrice CLI ===");
        System.out.println("1. Addition (+)");
        System.out.println("2. Soustraction (-)");
        System.out.print("Choisissez une option: ");

        int choix = scanner.nextInt();
        Operation op;

        if (choix == 1) {
            op = add;
        } else if (choix == 2) {
            op = sub;
        } else {
            System.out.println("Choix invalide.");
            scanner.close();
            return;
        }

        System.out.print("Premier nombre : ");
        double a = scanner.nextDouble();
        System.out.print("Deuxième nombre : ");
        double b = scanner.nextDouble();

        double resultat = op.calculer(a, b);
        System.out.println("Résultat : " + resultat);

        scanner.close();
    }
}