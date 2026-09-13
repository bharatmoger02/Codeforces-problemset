import java.util.Scanner;

public class YesorYes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while (n>0)
        {
            String str = sc.next();
            str=str.toUpperCase();
            if(str.equals("YES"))
                System.out.println("YES");
            else
                System.out.println("NO");
            n--;
        }
    }
}
