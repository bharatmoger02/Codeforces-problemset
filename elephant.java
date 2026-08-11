import java.util.Scanner;

public class elephant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        System.out.println(findSteps(distance));  
    }
    public static int findSteps(int distance)
    {
        int steps=0;
        while(distance>0)
        {
            if(distance<=5)
            {
                steps++;
                break;
            }
            if(distance>5)
            {
                distance = distance-5;
                steps++;
            }
        }
        return steps;
    }
}