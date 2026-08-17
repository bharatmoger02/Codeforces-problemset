import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String str= sc.next();
        int a=0;
        char[] chArr = str.toCharArray();
        for (char ch : chArr){
            if (ch=='A')
                a++;
        }
        if (a>n-a)
            System.out.println("Anton");
        else if (n-a>a)
            System.out.println("Danik");
        else
            System.out.println("Friendship");

    }
}
