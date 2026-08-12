import java.util.Scanner;

public class DominoPilling
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int squares=m*n;
        if(squares%2==0)
            System.out.println(squares/2);
        else
            System.out.println((squares-1)/2);
    }
}
