import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class DubStep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();

        String[] sArr = s.split("WUB");
        System.out.println(Arrays.toString(sArr));
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].isEmpty())
                continue;
            sArr[i]=sArr[i].trim();
            sb.append(sArr[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
