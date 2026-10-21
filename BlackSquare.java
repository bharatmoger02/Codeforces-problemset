import java.util.Arrays;
import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i]= sc.nextInt();
        }
        String s= sc.next();
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i]=s.charAt(i)-'0';
        }

        int calories=0;
        for(int n:arr){
            calories+=nums[n-1];
        }
        System.out.println(calories);
    }
}
