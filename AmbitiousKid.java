import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        int[] nums = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            nums[i]= sc.nextInt();
            nums[i]=Math.abs(nums[i]);
            if (nums[i]<min)
                min=nums[i];
        }
        System.out.println(min);
    }
}
