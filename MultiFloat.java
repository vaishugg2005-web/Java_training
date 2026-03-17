import java.util.Scanner;
public class MultiFloat {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float a = obj.nextFloat();
        float b = obj.nextFloat();
        float multiply = a * b;
        System.out.println("Multiplication of two float nos: " + multiply);
        obj.close();
    }
}
