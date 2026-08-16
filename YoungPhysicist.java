import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int xaxis=0;
        int yaxis=0;
        int zaxis=0;
        for (int i = 0; i < n; i++) {
            int x= sc.nextInt();
            int y=sc.nextInt();
            int z= sc.nextInt();

            xaxis+=x;
            yaxis+=y;
            zaxis+=z;
        }
        if(xaxis==0 && yaxis==0 && zaxis==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
