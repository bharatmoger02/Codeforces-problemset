import java.util.ArrayList;
import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        ArrayList<Integer> list=new ArrayList<>();
        int j=1;
        int i=0;
        while (i< arr.length) {
            if(arr[i]==j) {
                list.add(i+1);
                j++;
                i=0;
            }
            else
                i++;
        }

        for (int x : list)
            System.out.print(x+ " ");
    }
}
