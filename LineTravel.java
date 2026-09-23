import java.util.Scanner;

public class LineTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0)
        {
            int n= sc.nextInt();
            int x= sc.nextInt();
            int[] nums = new int[n];
            int mid=0;
            for (int i = 0; i < nums.length; i++) {
                nums[i]= sc.nextInt();
                if (i>=1)
                   mid= Math.max(mid, nums[i]-nums[i-1]);
            }
            int start=nums[0];
            int end=2*(x-nums[nums.length-1]);
            int minFuel = Math.max(start, Math.max(mid, end));
            System.out.println(minFuel);
        }
    }
}
