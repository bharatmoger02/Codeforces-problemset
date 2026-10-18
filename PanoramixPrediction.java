import java.util.Scanner;

public class PanoramixPrediction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();
        if (y>47)
        {
            System.out.println("NO");
            return;
        }
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
        int index=0;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]==x)
                index=i;
        }

        if(primes[index+1]==y)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
