import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (!map.containsKey(s)){
                System.out.println("OK");
                map.put(s,1);
            }
            else {
                int freq=map.get(s);
                System.out.println(s+freq);
                map.put(s,freq+1);
            }
        }
    }
}
