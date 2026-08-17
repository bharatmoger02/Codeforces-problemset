import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String w= sc.next();
        char[] sArr = s.toCharArray();
        char[] wArr=w.toCharArray();

        if (sArr.length!= wArr.length){
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i]!=wArr[wArr.length-1-i]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
