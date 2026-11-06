import java.util.Scanner;

public class PolycarpAndCoins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a=n/3;
            int b=a;
            if (n%3==0)
                System.out.println(a+" "+b);
            else if(n%3==1)
                System.out.println((a+1) + " "+b);
            else
                System.out.println(a+ " "+ (b+1));
        }
    }
}
