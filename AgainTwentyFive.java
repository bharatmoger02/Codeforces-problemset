import java.util.Scanner;

public class AgainTwentyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        if(n==0)
            System.out.println(0);
        if (n==1)
            System.out.println(5);
        else
            System.out.println(25);
    }
}
