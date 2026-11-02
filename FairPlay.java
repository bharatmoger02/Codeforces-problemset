import java.util.Scanner;

public class FairPlay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int s1= sc.nextInt();
            int s2=sc.nextInt();
            int s3 =sc.nextInt();
            int s4= sc.nextInt();
            int p1 = Math.max(s1, s2);
            int p2=Math.max(s3, s4);
            if((p1>s3 ||p1>s4) && (p2>s1 || p2>s2))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
