import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] items = str.split("\\+");
        int[] numbers = new int[items.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(items[i]);
        }
        Arrays.sort(numbers);

        StringBuilder sb = new StringBuilder();
        for (int num : numbers){
            sb.append(num);
            sb.append("+");
        }

        String result = sb.substring(0, sb.length()-1);
        System.out.println(result);
    }
}
