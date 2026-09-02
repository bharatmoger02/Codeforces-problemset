import java.util.Scanner;

public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] steps = new int[n];
        for (int i = 0; i < n; i++) {
            steps[i]= sc.nextInt();
        }

        int sequence=1;
        int maxSeq=1;
        for (int i = 1; i < n; i++) {
            if(steps[i]<steps[i-1])
                sequence=1;
            else
                sequence+=1;
            maxSeq=Math.max(maxSeq, sequence);
        }
        System.out.println(maxSeq);
    }
}
