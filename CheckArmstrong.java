import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int original = n;   
        int temp = n;
        int count = 0;
        while(temp!= 0){
            temp = temp/10;
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
            System.out.println("The given number is an Armstrong number.");
        } else {
            System.out.println("The given number is not an Armstrong number.");
        }

        obj.close();
    }
}
