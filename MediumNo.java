import java.util.Arrays;
import java.util.Scanner;

public class MediumNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int[] nums = {a, b, c};
            Arrays.sort(nums);
            System.out.println(nums[1]);
        }
    }
}
