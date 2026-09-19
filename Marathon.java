import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int[] nums = new int[4];
            for (int i = 0; i < nums.length; i++) {
                nums[i]= sc.nextInt();
            }

            int count=0;
            for (int i = 1; i < 4; i++) {
                if (nums[0]<nums[i])
                    count++;
            }
            System.out.println(count);
        }

    }
}
