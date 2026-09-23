import java.util.Scanner;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0)
        {
            int n= sc.nextInt();
            int[] nums = new int[n];
            int sum=0;
            for (int i = 0; i < nums.length; i++) {
                nums[i]= sc.nextInt();
                sum+=nums[i];
            }
            if (sum%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
