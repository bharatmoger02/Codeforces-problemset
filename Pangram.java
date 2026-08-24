import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String s= sc.next();
        String str = s.toLowerCase();
        for (char ch = 'a'; ch<='z'; ch++) {
            if (str.indexOf(ch)==-1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
