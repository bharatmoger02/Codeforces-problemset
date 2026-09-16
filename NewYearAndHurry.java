import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();

        int remTime = 240-k;
        int count=0;
        int time=5;
        while(n>0 && remTime>=time)
        {
            remTime-=time;
            count++;
            time+=5;
            n--;
        }
        System.out.println(count);
    }
}
