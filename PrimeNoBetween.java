import java.util.Scanner;
public class PrimeNoBetween {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int start = obj.nextInt();
        int end = obj.nextInt();
        for(int n = start; n <= end; n++) {
            boolean isPrime = true;
            if(n <= 1){
                isPrime = false;
            }
            else{
                for(int i = 2; i <= n-1; i++){
                    if(n % i == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.print(n + " ");
            }
        }

        obj.close();
    }
}

