import java.util.Scanner;

public class DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String str = sc.next();
            boolean isBroke=false;
            for (int i = 0; i < str.length()-1; i++) {
                boolean isSame=true;
                for (int j = i+1; j < str.length(); j++) {
                    if (str.charAt(i)!=str.charAt(j))
                        isSame=false;
                    if (str.charAt(i)==str.charAt(j)&& !isSame) {
                        System.out.println("NO");
                        isBroke=true;
                        break;
                    }
                }
                if (isBroke)
                    break;
            }
            if (!isBroke)
                System.out.println("YES");
        }
    }
}
