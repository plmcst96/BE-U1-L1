import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Scrivi qui tre parole a tua scelta!");
        String first = input.nextLine();
        System.out.println("Prima parola " + first);
        String second = input.nextLine();
        System.out.println("Seconda parola " + second);
        String third = input.nextLine();
        System.out.println("Terza parola " + third);

        String finalStr = first + " " + second + " " + third;
        System.out.println("Ecco la stringa risultante" + " " + finalStr);

        String reverseStr = second +  " " + first + " " + third;
        System.out.println("proviamoci al contrario!" + reverseStr);

        input.close();
    }
}
