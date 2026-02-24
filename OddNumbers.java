import java.util.*;

public class OddNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=100;i++){
            if(i%2!=0)
                list.add(i);
        }

        System.out.println("Odd Numbers: " + list);

        System.out.println("Minimum = " + list.get(0));
        System.out.println("Maximum = " + list.get(list.size()-1));

        int sum=0;
        for(int n:list)
            sum+=n;

        System.out.println("Sum = " + sum);
    }
}
