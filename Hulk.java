import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        StringBuilder sb= new StringBuilder("I hate it");
        if(n==1) {
            System.out.println(sb.toString());
            return;
        }
        for (int i = 2; i <= n; i++) {
            if(i%2==0) {
                int lsp=sb.lastIndexOf(" ");
                sb.replace(lsp, sb.length(), " that");
                sb.append(" I love it");
            }
            if (i%2==1 && i!=1){
                int lsp=sb.lastIndexOf(" ");
                sb.replace(lsp, sb.length(), " that");
                sb.append(" I hate it");
            }
        }
        System.out.println(sb.toString());
    }
}
