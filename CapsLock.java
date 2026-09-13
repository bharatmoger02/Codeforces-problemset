import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();

        boolean caps=true;
        for(char c:str.toCharArray())
        {
            if(Character.isLetter(c) && !Character.isUpperCase(c)) {
                caps = false;
                break;
            }
        }

        if (caps) {
            System.out.println(str.toLowerCase());
            return;
        }

        boolean fl=Character.isLowerCase(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (!Character.isUpperCase(str.charAt(i))){
                fl=false;
                break;
            }
        }

        if (fl){
            String s=Character.toUpperCase(str.charAt(0))+str.substring(1).toLowerCase();
            System.out.println(s);
            return;
        }

        System.out.println(str);
    }
}
