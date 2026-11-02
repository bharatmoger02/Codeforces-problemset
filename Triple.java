import java.util.Arrays;
import java.util.Scanner;

public class Triple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i]= sc.nextInt();
            }
            Arrays.sort(nums);
            int j=0;
            int count=0;
            for (int i = 0; i < n; i++) {
                if (nums[i]==nums[j]) {
                    count++;
                    if (count == 3) {
                        System.out.println(nums[j]);
                        break;
                    }
                }
                else {
                    j = i;
                    count = 0;
                    i--;
                }
            }
            if (count<3)
                System.out.println(-1);
        }
    }
}
