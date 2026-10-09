import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        int grids=n*m;
        int count=0;
        while(grids>0){
            grids= grids-(n+m-1);
            n--;
            m--;
            count++;
        }

        if (count%2==0)
            System.out.println("Malvika");
        else
            System.out.println("Akshat");
    }
}
