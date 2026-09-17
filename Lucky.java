import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0)
        {
            String str= sc.next();
            int[] nums = new int[str.length()];
            for (int i = 0; i < nums.length; i++) {
                nums[i]=str.charAt(i)-'0';
            }
            int sumA=0;
            int sumB=0;
            for (int i=0; i<3; i++)
            {
                sumA+=nums[i];
            }
            for (int i = nums.length-1; i > nums.length-4 ; i--) {
                sumB+=nums[i];
            }
            if (sumA==sumB)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
