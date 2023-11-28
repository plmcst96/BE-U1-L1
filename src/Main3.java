import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il valore dei 2 lati del rettangolo!");
        double l1 = input.nextDouble();
        double l2 = input.nextDouble();
        System.out.println("Ecco il perimetro del tuo rettangolo: " + perimeterRettangle(l1, l2));

        System.out.println("scegli il tuo numero e vediamo il risultato!");
        int n = Integer.parseInt(input.nextLine());
        if (pariDispari(n) == 0) System.out.println(n + " è pari");
        else System.out.println(n + " è dispari");

        System.out.println("scegli tre numeri per i lati del tuo rettangolo!");
        double m1 = Double.parseDouble(input.nextLine());
        double m2 = Double.parseDouble(input.nextLine());
        double m3 = Double.parseDouble(input.nextLine());
        System.out.println("L'area del triangolo è " + areaTriangle(m1, m2, m3));
        input.close();
    }

    public static double perimeterRettangle(double l1, double l2) {
        return (l1 * 2) + (l2 * 2);
    }

    public static int pariDispari(int num) {
        if (num % 2 == 0) return 0;
        else return 1;
    }

    public static double areaTriangle(double m1, double m2, double m3) {
        double p = (m1 + m2 + m3) / 2;
        return Math.sqrt(p * (p - m1) * (p - m2) * (p - m3));
    }
}
