import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int l= sc.nextInt();

        int[] nums = new int[n];
        boolean leftCorner=true;
        boolean rightCorner=true;
        for (int i = 0; i < nums.length; i++) {
            nums[i]= sc.nextInt();
        }
        Arrays.sort(nums);
        if(nums[0]!=0)
            leftCorner=false;
        if(nums[nums.length-1]!=l)
            rightCorner=false;

        double maxDiff=Integer.MIN_VALUE;
        double left=0;
        double right=0;
        for (int i = 1; i < nums.length; i++) {
           double diff= nums[i]-nums[i-1];
           maxDiff=Math.max(diff, maxDiff);
        }
        if (!leftCorner)
            left=nums[0];
        if (!rightCorner)
            right=l-nums[nums.length-1];

        System.out.println(Math.max(maxDiff/2, Math.max(left, right)));

    }
}
