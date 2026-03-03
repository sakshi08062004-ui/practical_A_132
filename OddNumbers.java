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

public class OddNumbers {

    public static void main(String[] args) {
        OddNumbers();   // calling the method
    }

    public static void OddNumbers() {

        int sum = 0;
        int count = 0;

        System.out.print("Odd Numbers between 1 and 50: ");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }
        }

        System.out.println();

        System.out.println("Three Minimum Odd Numbers: 1, 3, 5");
        System.out.println("Three Maximum Odd Numbers: 45, 47, 49");

        double average = (double) sum / count;
        System.out.println("Average of Odd Numbers: " + average);
    }
}

