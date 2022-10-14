import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        somme();
        division1(5,3);
        division2();
        volume();
    }

    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                "est egale a " + somme);
    }

    public static void division1(int premierEntier, int deuxiemeEntier){
        int division = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " par " + deuxiemeEntier +
                "est egale a " + division);
    }

    public static void division2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int division = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " par " + deuxiemeEntier +
                "est egale a " + division);
    }

    public static void volume(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le premier entier");
        int troisiemeEntier = scanner.nextInt();
        int volume = premierEntier * deuxiemeEntier * troisiemeEntier;
        System.out.println("Le volume du pavé droit de longueur " + premierEntier + ", de largueur " + deuxiemeEntier +
                "et de hauteur " + troisiemeEntier +"est egale a " + volume);
    }

    public static class TP_2 {
    }
}