import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            if (i%2==1){
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            }
            if (i%4==2){
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }
                System.out.print("#");
            }
            if (i%4==0){
                System.out.print("#");
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}