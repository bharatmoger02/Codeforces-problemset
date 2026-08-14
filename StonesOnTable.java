import java.util.Scanner;

public class StonesOnTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String s= sc.next();
        int remove=0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==s.charAt(i-1))
                remove++;
        }
        System.out.println(remove);
    }
}


