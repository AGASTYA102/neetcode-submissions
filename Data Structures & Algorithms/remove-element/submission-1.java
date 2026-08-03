class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0 ;
        int j = nums.length-1;
        int temp = 0;
        while(i <= j) {
        	while(nums[j] == val && j > 0) {
        		j--;
        	}
        	if(nums[i] == val) {
        		temp = nums[j];
        		nums[j] = nums[i];
        		nums[i] = temp;
        		j--;
        		
        	}else{
        	    i++;
            }
        }
        int k = 0;
        for(int t : nums) {
        	if(t == val) {
        		break;
        	}
        	k++;
        }
        return k;
    }
}