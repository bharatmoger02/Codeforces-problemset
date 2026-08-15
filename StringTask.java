import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        String str=s.toLowerCase();

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='y'){
                sb.append('.');
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
