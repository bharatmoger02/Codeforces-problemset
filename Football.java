import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        char[] chars = str.toCharArray();
        int[] arr= new int[chars.length];

        for (int i = 0; i < str.length(); i++) {
            arr[i]=chars[i]-'0';
        }
        int count=1;
        int j=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[j]!=arr[i]) {
                j = i;
                count = 1;
            }
            else
                count++;
            if(count==7) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
