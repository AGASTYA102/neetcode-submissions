class Solution {
    public int firstMissingPositive(int[] nums) {
    	HashSet<Integer> set = new HashSet<>();
    	int max = 0;
    	for(int x : nums) {
    		if(x > 0) {
    			set.add(x);
    		}
    		max = Math.max(max, x);
    	}
    	for(int i = 0 ; i < max ; i++) {
    		if(!set.contains(i+1)) {
    			return i+1;
    		}
    	}
        return max+1;
    }
}