class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int l = 0 ; l < nums.length - 3 ; l++) {
        	if (l > 0 && nums[l] == nums[l - 1]) {
                continue;
            }
        for (int i = l+1; i < nums.length - 2; i++) {

            // Skip duplicate values of i
            if (i > l+1 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                long sum = (long)nums[i] + nums[j] + nums[k] + nums[l] - target;

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                    j++;
                    k--;

                    // Skip duplicates for j
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicates for k
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }

                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        }

        return ans;
    }
}