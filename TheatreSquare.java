import java.util.Scanner;

public class TheatreSquare
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long m=sc.nextInt();
        long n=sc.nextInt();
        long a=sc.nextInt();
        long result = ((m+a-1)/a) * ((n+a-1)/a);
        System.out.println(result);
    }
}
