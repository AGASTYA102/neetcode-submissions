class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();

        k = k % nums.length; // handle k > length
        int start = nums.length - k;

        // Add last k elements
        for (int i = start; i < nums.length; i++) {
            ans.add(nums[i]);
        }

        // Add remaining elements
        for (int i = 0; i < start; i++) {
            ans.add(nums[i]);
        }

        // Copy back to nums
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans.get(i);
        }
    }
}