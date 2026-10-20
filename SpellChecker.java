import java.util.Arrays;
import java.util.Scanner;

public class SpellChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String s= sc.next();
            char[] arr =s.toCharArray();
            Arrays.sort(arr);

            char[] arr2 = "Timur".toCharArray();
            Arrays.sort(arr2);

            if (Arrays.equals(arr, arr2))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
