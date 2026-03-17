import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        boolean isPrime = true;
        if(n<= 1){
            isPrime = false;
        }
        else{
            for(int i = 2;i<= n-1 ; i++){
                if(n%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        obj.close();
    }
}
