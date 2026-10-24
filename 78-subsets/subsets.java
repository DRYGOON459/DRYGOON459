import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int index, int[] nums,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // Store the current subset
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            // Include the element
            current.add(nums[i]);

            // Explore further subsets
            backtrack(i + 1, nums, current, result);

            // Remove the element (backtracking)
            current.remove(current.size() - 1);
        }
    }
}