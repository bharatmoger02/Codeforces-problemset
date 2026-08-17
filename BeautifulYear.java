import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year= sc.nextInt();
        while (true){
            year++;
            String str=String.valueOf(year);
            HashSet<Character> set = new HashSet<>();
            for(char ch : str.toCharArray())
            {
                set.add(ch);
            }
            if (set.size()==str.length())
            {
                System.out.println(year);
                break;
            }
        }
    }
}
