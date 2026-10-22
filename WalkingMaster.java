import java.util.Scanner;

public class WalkingMaster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t= sc.nextLong();
        while (t-->0){
            long a= sc.nextLong();
            long b= sc.nextLong();
            long c= sc.nextLong();
            long d= sc.nextLong();
            if (b > d || a + (d - b) < c) {
                System.out.println(-1);
            } else {
                System.out.println((d - b) + (a + (d - b) - c));
            }
        }
    }
}
