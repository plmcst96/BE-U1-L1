import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(multiply(17, 4));
        System.out.println(concat("My age is ", 28));
        System.out.println(Arrays.toString(insertArray(new String[]{"Io", "vorrei", "capirci", "qualcosa", "ma"}, "nulla")));
    }
    public static String concat(String str, int x) {
        return str + x;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }
    public static String[] insertArray(String[] strArr, String str) {
        String[] newArr = new String[6];

        for (int i = 0; i < newArr.length; i++) {
            if (i < 3) newArr[i] = strArr[i];
            else if (i == 3) newArr[i] = str;
            else newArr[i] = strArr[i - 1];
        }
        return newArr;
    }
}