import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums = new int[n];
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums[i]= sc.nextInt();
            if (nums[i]==1)
                list1.add(i);
            if (nums[i]==2)
                list2.add(i);
            if (nums[i]==3)
                list3.add(i);
        }

        int result=Math.min(list1.size(), Math.min(list2.size(), list3.size()));
        System.out.println(result);
        for (int i = 0; i < result; i++) {
            System.out.println((list1.get(i)+1)+" "+ (list2.get(i)+1)+" "+(list3.get(i)+1));
        }

    }
}
