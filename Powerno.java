import java.util.Scanner;
public class Powerno {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        int n = obj.nextInt();
        long result = 1;
        for(int i = 0; i < n; i++) {
            result = result * x;
        }
        System.out.println("Result is: " + result);
        obj.close();
    }
}
