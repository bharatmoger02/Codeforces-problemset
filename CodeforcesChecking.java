import java.util.Scanner;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="codeforces";
        char[] arr = str.toCharArray();
        int t= sc.nextInt();
        while (t-->0){
            char ch = sc.next().charAt(0);
            boolean found=false;
            for (char c : arr) {
                if (ch == c) {
                    System.out.println("YES");
                    found=true;
                    break;
                }
            }
            if (!found)
                System.out.println("NO");
        }
    }
}
