import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        obj.close();

    }
}
