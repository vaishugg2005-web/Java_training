import java.util.Scanner;
public class ReverseNo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int reverse = 0;
        while(n!= 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reversed number is: " + reverse);
        obj.close();
    }
}
