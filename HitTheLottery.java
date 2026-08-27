import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bills=0;
        while (n>0)
        {
            if (n>=100)
                n-=100;
            else if(n>=20)
                n-=20;
            else if(n>=10)
                n-=10;
            else if(n>=5)
                n-=5;
            else if(n>=1)
                n-=1;
            bills++;
        }
        System.out.println(bills);
    }
}
