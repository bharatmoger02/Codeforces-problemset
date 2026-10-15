import java.util.Scanner;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int index=0;
            int count=1;
            while (count<=n){
                index++;
                if(index%3!=0 && index%10!=3)
                    count++;
            }
            System.out.println(index);
        }
    }
}
