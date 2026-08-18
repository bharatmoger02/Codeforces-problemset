import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int passengers=0;
        int minCapacity=0;
        while (n>0)
        {
            int a= sc.nextInt();
            int b= sc.nextInt();
            passengers=passengers-a+b;
            minCapacity=Math.max(minCapacity, passengers);
            n--;
        }
        System.out.println(minCapacity);
    }
}
