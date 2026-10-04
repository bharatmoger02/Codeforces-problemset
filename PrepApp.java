import java.util.*;
public class PrepApp
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str = sc.next();
            int[] nums = new int[n];

            for (int i = 0; i<n; i++) {
                nums[i] = str.charAt(i) - '0';
            }

            int i=0;
            int j=n-1;
            while(i<j)
            {
                if((nums[i]==0 && nums[j]==1) || (nums[i]==1 && nums[j]==0)){
                    i++;
                    j--;
                }
                else
                    break;
            }

            if(i==j)
                System.out.println(1);
            else if(i>j)
                System.out.println(0);
            else
                System.out.println(j-i+1);
        }
    }
}