import java.util.Scanner;

public class TargetPractise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            char[][] arr = new char[10][10];
            for (int i = 0; i < 10; i++) {
                String s= sc.next();
                for (int j = 0; j < 10; j++) {
                    arr[i][j] = s.charAt(j);
                }
            }

            int points=0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (arr[i][j]=='X')
                    {
                        if (i==0 || j==0 || i==9 || j==9)
                            points+=1;
                        else if (i==1 || j==1 || i==8 || j==8)
                            points+=2;
                        else if (i==2 || j==2 || i==7 || j==7)
                            points+=3;
                        else if (i==3 || j==3 || i==6 || j==6)
                            points+=4;
                        else points+=5;
                    }
                }
            }
            System.out.println(points);
        }
    }
}
