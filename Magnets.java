import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int groups=1;
        String[] sArr = new String[n];
        for (int i = 0; i < n; i++) {
            sArr[i]= sc.next();
        }

        for (int i = 1; i < n; i++) {
            if(!sArr[i].equals(sArr[i-1]))
                groups++;
        }
        System.out.println(groups);
    }
}
