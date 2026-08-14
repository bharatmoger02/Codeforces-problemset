import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();

        String w =word.substring(0, 1).toUpperCase()+word.substring(1);
        System.out.println(w);
    }
}
