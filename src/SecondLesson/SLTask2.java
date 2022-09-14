package SecondLesson;

import java.util.Arrays;

public class SLTask2 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target)
                    return new int[] {i, j};
            }
        }
        return new int[] {0,0};
        }

    public static void main(String[] args) {
        int [] nums = {6, 5, 2, 8, 1, 5, 1};
        int target = 9;
        int [] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}