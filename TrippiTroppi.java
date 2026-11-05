import java.util.Scanner;

public class TrippiTroppi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String s= sc.nextLine();
            String[] arr = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for(String str : arr){
                sb.append(str.charAt(0));
            }
            String str = sb.toString();
            System.out.println(str);
        }
    }
}
