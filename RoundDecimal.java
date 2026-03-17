import java.util.Scanner;
public class RoundDecimal {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float a = obj.nextFloat();
        int n = obj.nextInt();
        float round = (float)(Math.round(a * Math.pow(10, n)))/ (float) Math.pow(10,n);
        System.out.println("Rounded value :" + round);
        obj.close();
    }
}
