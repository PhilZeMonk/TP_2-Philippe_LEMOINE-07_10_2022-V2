import java.util.Scanner;

public class TP_2 {

    public static void main(String[] args) {
        discriminant();
        nombrePairImpair();
        MaxMin();
        egaliteStr();
        factorielle();
        countdown();
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
        }
        if (delta == 0){
            int soluce = -1*b/(2*a);
            System.out.println("la solution double est " + soluce);
        }
        if (delta > 0){
            double soluce1 = (-1*b + Math.sqrt(delta))/(2*a);
            double soluce2 = (-1*b + Math.sqrt(delta))/(2*a);
            System.out.println("la solution double est " + soluce1 + " et " + soluce2);
        }
    }
    public static void nombrePairImpair() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un entier ?");
        int entier = scanner.nextInt();
        int b = entier%2;
        if (b == 0){
            System.out.println("Cet entier est pair et c'est l'entier " + entier);
        }
        else {
            System.out.println("Cet entier est impair et c'est l'entier " + entier);
        }
    }
    public static void MaxMin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un entier :");
        int entier1 = scanner.nextInt();
        System.out.println("Saisissez un autre entier :");
        int entier2 = scanner.nextInt();
        if (entier1 > entier2){
            System.out.println("L'entier " + entier1 + " est le maximum, tandis que l'entier " + entier2 + " est le minimum");
        }
        else if (entier1 < entier2) {
            System.out.println("L'entier " + entier2 + " est le maximum, tandis que l'entier " + entier1 + " est le minimum");
        }
        else {
            System.out.println("Ces deux entier sont égaux et valent " + entier1);
        }
    }
    public static void egaliteStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez une chaine de charactère");
        String Char1 = scanner.nextLine();
        System.out.println("Saisissez une chaine de charactère");
        String Char2 = scanner.nextLine();
        if (Char1.equals(Char2)){
            System.out.println("Ces deux chaines sont les mêmes et elles sont '" + Char1 + "'");
        }
        else {
            System.out.println("Ces deux chaines ne sont pas les mêmes et elles sont '" + Char1 + "' et '" + Char2 +"'");
        }
    }
    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        int factorielle = 1;
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }
    public static void countdown(){
        for (int Dep = 10; Dep >= 0; Dep--){
            System.out.println(Dep);
        }
        System.out.println("BOOM CAPITAINE !");
    }
}
