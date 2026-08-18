import java.util.Scanner;

public class GeorgeAndAccmdtn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int rooms=0;
        for (int i = 0; i < n; i++) {
            int p= sc.nextInt();
            int q= sc.nextInt();
            int spaces=q-p;
            if(spaces>1)
                rooms++;
        }
        System.out.println(rooms);
    }
}
