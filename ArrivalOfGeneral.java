import java.util.Arrays;
import java.util.Scanner;

public class ArrivalOfGeneral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] soldiers=new int[n];
        for (int i = 0; i < n; i++) {
            soldiers[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        int swap=0;
        for (int i = 0; i < n; i++) {
            if (soldiers[i]>max){
                max=soldiers[i];
                maxIndex=i;
            }
        }

        for (int i =maxIndex ; i >0 ; i--) {
            if (soldiers[i]==soldiers[0])
                break;
            int temp=soldiers[i];
            soldiers[i]=soldiers[i-1];
            soldiers[i-1]=temp;
            swap++;
        }
        int min=Integer.MAX_VALUE;
        int minIndex=0;
        for (int i = 0; i < n; i++) {
            if (soldiers[i]<=min){
                min=soldiers[i];
                minIndex=i;
            }
        }
        for (int i=minIndex; i<n-1; i++){
            if (soldiers[i]==soldiers[n-1])
                break;
            int temp=soldiers[i];
            soldiers[i]=soldiers[i+1];
            soldiers[i+1]=temp;
            swap++;
        }
        //System.out.println(Arrays.toString(soldiers));
        System.out.println(swap);
    }
}
