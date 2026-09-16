import java.util.Arrays;
import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int sereja = 0;
        int dima = 0;

        boolean serejaTurn = true;

        int a=0;
        int b= nums.length-1;
        while(n>0)
        {
            if(serejaTurn){
                if (nums[a]<nums[b]){
                    sereja+=nums[b];
                    b--;
                }
                else {
                    sereja+=nums[a];
                    a++;
                }
                serejaTurn=false;
            }
            else {
                if (nums[a]<nums[b]){
                    dima+=nums[b];
                    b--;
                }
                else {
                    dima+=nums[a];
                    a++;
                }
                serejaTurn=true;
            }
            n--;
        }

        System.out.println(sereja + " " + dima);
    }
}