import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < nums.length; i++) {
                nums[i]= sc.nextInt();
            }

            boolean isZero=false;
            int count=0;
            int maxZero=0;
            for (int num : nums) {
                if (num == 0 && isZero)
                    count += 1;
                if (num == 0 && !isZero) {
                    count = 1;
                    isZero = true;
                }
                if (num == 1)
                    isZero = false;
                maxZero = Math.max(maxZero, count);
            }
            System.out.println(maxZero);
        }
    }
}
