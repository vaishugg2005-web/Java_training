import java.util.Scanner;
public class ArmstrongNoBetween {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int start = obj.nextInt();
        int end = obj.nextInt();
        for (int n = start; n <= end; n++) {
            int original = n;
            int temp = n;
            int count = 0;
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
            int sum = 0;
            temp = n;
            while (temp != 0) {
                int digit = temp % 10;
                sum = sum + (int) Math.pow(digit, count);
                temp = temp / 10;
            }
            if (sum == original) {
                System.out.print(n + " ");
            }
        }
        obj.close();
    }
}
