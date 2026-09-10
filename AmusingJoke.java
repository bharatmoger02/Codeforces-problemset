import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        String b= sc.next();
        String c= sc.next();

        if (a.length()+b.length()!=c.length()){
            System.out.println("NO");
            return;}

        String str=a+b;
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        char[] arr2 = c.toCharArray();
        Arrays.sort(arr2);

        if (Arrays.equals(arr, arr2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
