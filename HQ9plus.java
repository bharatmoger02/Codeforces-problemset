import java.util.Scanner;

public class HQ9plus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();

        if (str.equals("+"))
        {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(0)=='+')
                continue;
            if(str.charAt(i)=='+') {
                char ch=str.charAt(i-1);
                ch++;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='H' || str.charAt(i)=='Q' || str.charAt(i)=='9') {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
