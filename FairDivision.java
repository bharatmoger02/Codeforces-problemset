import java.util.Scanner;

public class FairDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            int sum = 0;
            boolean oneInArr = false;
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                sum += nums[i];
                if (nums[i]==1)
                    oneInArr=true;
            }
            if (oneInArr){
                if (sum%2==0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else{
                if ((sum/2)%2==0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
