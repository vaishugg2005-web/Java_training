import java.util.Scanner;
public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        int n = str.length();
        int count = 0;
        for(int i = 0; i<n ;i++){
            if (str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("The Frequency of char in string is:" + count);
        sc.close();
    }
}
