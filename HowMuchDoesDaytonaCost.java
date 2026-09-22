import java.util.Scanner;

public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0)
        {
            int n= sc.nextInt();
            int k= sc.nextInt();
            int[] nums = new int[n];
            boolean found=false;
            for (int i = 0; i < nums.length; i++) {
                nums[i]= sc.nextInt();
                if (nums[i]==k)
                    found=true;
            }
            if (found)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
