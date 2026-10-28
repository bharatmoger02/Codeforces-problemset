import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i]= sc.nextLong();
        }
        int length=1;
        int maxLen = 1;
        for(int i=1; i< nums.length; i++){
            if(nums[i]>nums[i-1])
                length++;
            else{
                maxLen=Math.max(maxLen, length);
                length=1;
            }
        }
        maxLen=Math.max(maxLen, length);
        System.out.println(maxLen);
    }
}
