import java.util.Scanner;

public class Findfact {
    public static int fact(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int result = fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
        obj.close();
    }
    
}
