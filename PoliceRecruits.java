import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums = new int[n];
        int crimes=0;
        int police=0;
        for (int i = 0; i < n; i++) {
            nums[i]= sc.nextInt();
            if(nums[i]>=1)
                police+=nums[i];
            if(nums[i]==-1 && police==0)
                crimes++;
            if (nums[i]==-1 && police!=0)
                police--;
        }
        System.out.println(crimes);
    }
}
