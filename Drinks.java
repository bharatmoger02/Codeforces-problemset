import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        double sum=0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum/n);
    }
}
