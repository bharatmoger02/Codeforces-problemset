import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String str = sc.next();
            int count=0;
            int dotCount=0;
            for (int i = 0; i < n; i++) {
                if(str.charAt(i)=='.') {
                    count++;
                    dotCount++;
                    if (count==3)
                        break;
                }
                else
                    count=0;
            }
            if (count==3)
                System.out.println(count-1);
            else
                System.out.println(dotCount);
        }
    }
}
