import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
        int r= sc.nextInt();

        int count=1;
        int carp=k;
        while (count<10) {
            if (carp % 10 == r || carp % 10 == 0) {
                System.out.println(count);
                return;
            } else {
                carp += k;
                count++;
            }
        }
        System.out.println(count);
    }
}
