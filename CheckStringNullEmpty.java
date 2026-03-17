import java.util.Scanner;
public class CheckStringNullEmpty {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        if( str == null ){
            System.out.println("String is null");
        } else if( str.length() == 0 ){
            System.out.println("String is empty");
        } else {
            System.out.println("String is neither null nor empty");
        }
        obj.close();
    }
}
