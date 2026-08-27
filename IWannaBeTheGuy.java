import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int p= sc.nextInt();
        int[] x = new int[p];
        if (p!=0){
            x[0]=p;
            for (int i = 1; i <= p; i++) {
                x[i]= sc.nextInt();
            }
        }

        int q= sc.nextInt();
        int[] y = new int[q];
        if (q!=0){
            y[0]=q;
            for (int i = 1; i <= q; i++) {
                y[i]= sc.nextInt();
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num : x)
            set.add(num);
        for(int num : y)
            set.add(num);

        if(set.size()==n)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");

    }
}
