import java.util.HashSet;
import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();

        char[] chArr = str.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (char ch : chArr){
            if (Character.isLetter(ch))
                set.add(ch);
        }
        System.out.println(set.size());
    }
}
