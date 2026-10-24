import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int level=1;
        int cubes=0;
        while(true){
            int needed=(level*(level+1))/2;
            if (cubes+needed>n)
                break;
            cubes+=needed;
            level++;
        }
        System.out.println(level-1);
    }
}
