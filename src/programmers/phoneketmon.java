package programmers;

import java.util.HashSet;

public class phoneketmon {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};

        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        int result = 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        result = Math.min(nums.length / 2, set.size());

        return result;
    }
}
