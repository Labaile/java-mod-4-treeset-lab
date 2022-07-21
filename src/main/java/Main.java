import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 2, 34, 36, 5, 4, 23, 45, 6, 8, 56, 34, 37};
        ArrayList<Integer> res = getNums(numbers);
        System.out.println(res); // [34, 36, 37, 45, 56]
    }

    public static ArrayList<Integer> getNums(int[] nums) {
        // your code here
        TreeSet<Integer> numTreeSet = new TreeSet<>();
        ArrayList<Integer> numList = new ArrayList<>();

        for (Integer num : nums) {
            if (num > 25) {
                numTreeSet.add(num);
            }
        }
        numList.addAll(numTreeSet);

        return numList;
        //return null

    }
}