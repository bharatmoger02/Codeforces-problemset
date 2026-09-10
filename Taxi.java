import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= sc.nextInt();
        }

        Arrays.sort(nums);
        int count=0;
        int i=0;
        int j= nums.length-1;
        while (i<=j)
        {
            if (nums[j]==4) {
                count++;
                j--;
            }

            else if (nums[j]==3) {
                count++;
                j--;
                if (i<=j && nums[i]==1)
                    i++;

            }

            else if (nums[j]==2){
                count++;
                j--;
                if (i<=j && nums[i]==2)
                    i++;
                else if(i<=j && nums[i]==1)
                    i++;
                    if (i<=j && nums[i]==1)
                        i++;
            }
            else {
                int remaining = j - i + 1;
                count += (remaining + 3) / 4;
                break;
            }
        }
        System.out.println(count);
    }
}
