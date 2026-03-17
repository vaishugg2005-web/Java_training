import java.util.Scanner;
public class CheckPositiveNegative {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if ( n > 0){
            System.out.println("Number is positive");
        }
        else if(n< 0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is zero");
        }
        obj.close();
    }
}
