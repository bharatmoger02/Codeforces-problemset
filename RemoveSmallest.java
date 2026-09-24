import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int[] nums = new int[n];
            boolean isPossible=true;
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }

            Arrays.sort(nums);
            for (int i = 1; i < n; i++) {
                if (nums[i]-nums[i-1]>1) {
                    isPossible = false;
                    System.out.println("NO");
                    break;
                }
            }

            if (isPossible)
                System.out.println("YES");
        }
    }
}
