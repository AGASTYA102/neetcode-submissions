class Solution {
    public int[] productExceptSelf(int[] nums) {
		int a = 1;
		int[] sol = new int[nums.length];
		boolean zero = false;
		int count = 0;
		for(int i  = 0; i < nums.length ; i++) {
			if( nums[i] != 0) {
				a = a * nums[i];
			}else {
				zero = true;
				count ++;
			}
		}
		for(int i =0; i < nums.length ; i++) {
			if(zero == true) {
				if(nums[i] != 0) {
					sol[i] = 0;
				}else if(nums[i] == 0 && count > 1) {
					sol[i] = 0;
				}else if(nums[i] == 0 && count ==1) {
					sol[i] = a;
				}
			}else {
				sol[i] = a / nums[i];
			}
		}
		
		return sol;
        
    }
}  
