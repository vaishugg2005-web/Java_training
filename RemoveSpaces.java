import java.util.Scanner;
public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str_result = "";
        int n = str.length();
        for(int i = 0; i < n; i++){
            if (str.charAt(i) != ' '){
                str_result = str_result + str.charAt(i);
            }
        }
        System.out.println("String after removing spaces: " + str_result);
        sc.close();
    }
}
