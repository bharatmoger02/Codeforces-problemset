import java.util.Scanner;

public class PlusOneontheSubset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t= sc.nextLong();
        while (t-->0){
            int n= sc.nextInt();
            long[] nums = new long[n];
            long max = Long.MIN_VALUE;
            long min=Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                nums[i]= sc.nextLong();
                if (nums[i]>max)
                    max=nums[i];
                if (nums[i]<min)
                    min=nums[i];
            }
            System.out.println(max-min);
        }
    }
}
