import java.util.Scanner;
public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char ch = obj.next().charAt(0);
        if ( ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            System.out.println("Character is an alphabet");
        } else {
            System.out.println("Character is not an alphabet");
        }
        obj.close();
    }
}
