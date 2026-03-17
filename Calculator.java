import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int n = obj.nextInt();
        switch (n) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid input");
        }
        obj.close();
    }
}
