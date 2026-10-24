import java.util.Scanner;

public class BrainPhotos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        boolean isColored=false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char color = sc.next().charAt(0);
                if (color == 'C' || color == 'M' || color == 'Y')
                    isColored=true;
            }
        }
        if (isColored)
            System.out.println("#Color");
        else
            System.out.println("#Black&White");
    }
}
