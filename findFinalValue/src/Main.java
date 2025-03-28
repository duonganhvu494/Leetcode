import java.util.Arrays;
import java.util.SortedMap;

public class Main {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for (int num:nums){
            if (num == original){
                original*=2;
            }
        }
        return original;
    }

    public static void main(String[] args) {
        int[] a={5,2,1,4,3};
        Main main = new Main();
        System.out.println(main.findFinalValue(a,5));
    }
}