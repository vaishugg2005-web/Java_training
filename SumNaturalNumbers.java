import java.util.Scanner;
public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum = 0;
        for(int i = 1; i<= n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of 1st " + n + "natural numbers:" + sum);
        obj.close();
    }
}
