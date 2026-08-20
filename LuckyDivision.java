import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (luckyNo(i) && n%i==0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    private static boolean luckyNo(int x)
    {
        char[] arr = String.valueOf(x).toCharArray();
        for (char ch : arr){
            if (ch!='4' && ch!='7'){
                return false;
            }
        }
        return true;
    }
}
