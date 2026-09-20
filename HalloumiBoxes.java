import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0)
        {
            int n= sc.nextInt();
            int k= sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i]= sc.nextInt();
            }

            boolean isSorted=true;
            for (int i = 1; i < n; i++) {
                if (nums[i]<nums[i-1]) {
                    isSorted = false;
                    break;
                }
            }
            if (isSorted || n==k || k>=2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
