import java.util.Scanner;

public class BoyOrGirl
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String username=sc.nextLine();
        StringBuilder str=new StringBuilder();
        int count=0;
        for (int i = 0; i < username.length(); i++) {
            if(str.indexOf(String.valueOf(username.charAt(i)))==-1) {
                str.append(username.charAt(i));
                count++;
            }
        }
        if (count%2==0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
