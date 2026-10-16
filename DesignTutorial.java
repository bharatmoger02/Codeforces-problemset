import java.util.Scanner;

public class DesignTutorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=4;
        int b=n-a;
        while (a<=b){
            if (!isPrime(a) && !isPrime(b)){
                System.out.println(a+ " "+b);
                break;
            }
            else {
                a++;
                b--;
            }
        }
    }

    private static boolean isPrime(int x){
        for (int i = 2; (long) i *i<=x ; i++) {
            if (x%i==0)
                return false;
        }
        return true;
    }
}
