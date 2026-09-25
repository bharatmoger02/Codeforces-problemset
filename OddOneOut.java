import java.util.Scanner;

public class OddOneOut {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= 3;
            int[] nums = new int[n];
            for (int i = 0; i < nums.length; i++) {
                nums[i]= sc.nextInt();
            }

            int common=0;
            if (nums[0]==nums[1])
                common=nums[0];
            else if (nums[0]==nums[2])
                common=nums[0];
            else
                common=nums[1];

            for (int num : nums) {
                if (num != common) {
                    System.out.println(num);
                    break;
                }
            }
        }
    }
}
