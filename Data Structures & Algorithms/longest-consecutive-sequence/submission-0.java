class Solution {
    public int longestConsecutive(int[] nums) {
    	HashSet<Integer> set = new HashSet<>();
    	for(int x : nums) {
    		set.add(x);
    	}
    	int max = 0;
    	for(int i = 0 ; i < nums.length ; i++) {
    		int ans = 1;
    		if(!set.contains(nums[i]-1)) {
    			int temp = nums[i];
    			while(set.contains(temp+1)) {
    				ans++;
    				temp++;
    			}
    		}
    		max = Math.max(max, ans);
    	}
        return max;
    }
}
