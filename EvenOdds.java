import java.util.Arrays;
import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n= sc.nextLong();
        long k= sc.nextLong();
        long oddLimit=(n+1)/2;

        if(k<=oddLimit)
            System.out.println(2*k-1);
        else
            System.out.println(2*(k-oddLimit));
    }
}
