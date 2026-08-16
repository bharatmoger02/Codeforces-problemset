import java.util.Arrays;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int upper=0;
        int lower=0;

        char[] chArr= str.toCharArray();
        for (char ch : chArr)
        {
            if(Character.isUpperCase(ch))
                upper++;
            else
                lower++;
        }
        if (upper>lower)
            System.out.println(str.toUpperCase());
        else
            System.out.println(str.toLowerCase());
    }
}
