import java.util.Scanner;

public class ILoveUsername {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n==1) {
            System.out.println(0);
            return;
        }

        int[] nums =new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int records=0;
        if (nums[1]>nums[0])
        {
            max=nums[1];
            min=nums[0];
            records++;

        } else if (nums[1] < nums[0]) {
            max=nums[0];
            min=nums[1];
            records++;
        }
        else {
            max=nums[0];
            min=nums[1];
        }


        for (int i = 2; i < nums.length; i++) {
            if (nums[i]>max){
                records++;
                max=nums[i];
            }
            if (nums[i]<min){
                records++;
                min=nums[i];
            }
        }
        System.out.println(records);
    }
}
