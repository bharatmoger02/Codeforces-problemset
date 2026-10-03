import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr = str.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]=='.')
                list.add(0);
            else if (arr[i]=='-' && arr[i+1]=='.'){
                list.add(1);
                i++;
            } else if (arr[i]=='-' && arr[i+1]=='-'){
                list.add(2);
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int num : list) {
            sb.append(num);
        }

        System.out.println(sb.toString());
    }
}
