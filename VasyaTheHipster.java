import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int diff=0;
        while(a>0 && b>0)
        {
            diff++;
            a--;
            b--;
        }
        int same=0;
        if (a>0)
             same=a/2;
        if (b>0)
            same=b/2;
        System.out.println(diff+" "+same);
    }
}
