import java.util.Scanner;
public class ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        System.out.println("The ASCII VALUE IS:" + ascii);
        sc.close();
    }
}
