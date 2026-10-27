import java.util.Scanner;

public class SkibidusAndAmogu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            String str= sc.next();
            StringBuilder sb = new StringBuilder(str);
            sb.deleteCharAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
            sb.append('i');
            str= sb.toString();
            System.out.println(str);
        }
    }
}
