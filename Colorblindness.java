import java.util.Scanner;

public class Colorblindness {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String a= sc.next();
            String b= sc.next();
            boolean isSame=true;
            for (int i = 0; i < n; i++) {
                if((a.charAt(i)=='R'|| b.charAt(i)=='R') && a.charAt(i)!=b.charAt(i)) {
                    isSame = false;
                    break;
                }
            }
            if (isSame)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
