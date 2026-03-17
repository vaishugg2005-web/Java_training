import java.util.Scanner;
public class PrintInt{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = obj.nextInt();
        System.out.println("Entered integer value: " + a);
        obj.close();
    }
}