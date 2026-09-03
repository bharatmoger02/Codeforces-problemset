import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfRoundNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = String.valueOf(n).chars().map(c -> c - '0').toArray();
            int exp = (int) Math.pow(10, arr.length - 1);
            for(int i= 0; i< arr.length; i++)
            {
                arr[i]*=exp;
                exp/=10;
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>0)
                    list.add(arr[i]);
            }
            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}