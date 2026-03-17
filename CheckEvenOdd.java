import java.util.Scanner;
public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        if ( a % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        obj.close();
    }
}
