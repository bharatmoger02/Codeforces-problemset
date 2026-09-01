import java.util.Arrays;
import java.util.Scanner;

public class NewYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int[] axis = new int[3];
        axis[0]=a;
        axis[1]=b;
        axis[2]=c;
        Arrays.sort(axis);
        System.out.println((axis[1]-axis[0]) + (axis[2]-axis[1]));
    }
}
