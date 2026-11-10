import java.util.Scanner;

public class OneAndTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i]= sc.nextInt();
            }
            int k=1;
            boolean found=false;
            while (k<n){
                int n1=0;
                int n2=0;
                for (int i = 1; i <= k; i++) {
                    if (nums[i-1]==2)
                        n1++;
                }
                for (int i = k+1; i <= n; i++) {
                    if (nums[i-1]==2)
                        n2++;
                }
                if (n1==n2) {
                    System.out.println(k);
                    found = true;
                    break;
                }
                k++;
            }
            if (!found)
                System.out.println(-1);
        }
    }
}
