import java.util.Scanner;
public class GCDOfTwoNumbers {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int result = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);
        obj.close();
    }
}
