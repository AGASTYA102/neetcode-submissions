class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int large = numbers.length-1;
         int small = 0;
         int[] ans = new int[2];
         while(numbers[large]+numbers[small]!=target) {
        	 if(numbers[large]+numbers[small]>target) {
        		 large--;
        	 }else if(numbers[large]+numbers[small]<target) {
        		 small++;
        	 }
         }
         ans[0] = small+1;
         ans[1] = large+1;
         return ans;
    }
}
