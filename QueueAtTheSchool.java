import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int t= sc.nextInt();
        String str= sc.next();
        char[] charArr = str.toCharArray();
        while (t>0)
        {
            for (int i = 0; i < n - 1; i++) {
                if (charArr[i]=='B' && charArr[i+1]=='G'){
                    charArr[i]='G';
                    charArr[i+1]='B';
                    i++;
                }
            }
            t--;
        }
        System.out.println(new String(charArr));
    }
}
