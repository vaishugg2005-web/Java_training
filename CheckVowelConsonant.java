import java.util.Scanner;
public class CheckVowelConsonant {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char ch = obj.next().charAt(0);
        if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
            System.out.println("Character is a vowel");
        } else {
            System.out.println("Character is a consonant");
        }
        obj.close();
    }
}
