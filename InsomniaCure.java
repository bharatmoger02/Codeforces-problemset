import java.util.Scanner;

public class InsomniaCure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
        int l= sc.nextInt();
        int m= sc.nextInt();
        int n= sc.nextInt();
        int d= sc.nextInt();
        int hD=0;
        while (d>0)
        {
            if(d%k==0 || d%l==0 || d%m==0 || d%n==0)
            {
                hD++;
            }
            d--;
        }
        System.out.println(hD);
    }
}
