import java.util.Scanner;

public class CanISquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int[] nums = new int[n];
            long sum=0;
            for (int i = 0; i < n; i++) {
                nums[i]=sc.nextInt();
                sum+=nums[i];
            }
            long root = (long)Math.sqrt(sum);
            if(root*root==sum)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
