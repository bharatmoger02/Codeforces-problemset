import java.util.Scanner;

public class Iqtest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int odd=0;
        int even=0;
        for (int i = 0; i < n; i++) {
            nums[i]= sc.nextInt();
            if (nums[i]%2==1)
                odd++;
            else
                even++;
        }

        if (even==1){
            for (int i = 0; i < n; i++) {
                if (nums[i]%2==0)
                    System.out.println(i+1);
            }
        }

        if (odd==1){
            for (int i = 0; i < n; i++) {
                if(nums[i]%2==1)
                    System.out.println(i+1);
            }
        }
    }
}
