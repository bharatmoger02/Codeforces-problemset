import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i]= sc.nextInt();
        }

        Arrays.sort(nums);
        int i=0;
        int j=n-1;
        int minVal=Integer.MAX_VALUE;
        while (j< nums.length)
        {
            int diff=nums[j]-nums[i];
            minVal=Math.min(minVal, diff);
            i++;
            j++;
        }
        System.out.println(minVal);
    }
}
