class Solution {
    public int maxArea(int[] heights) {
		int ans = 0;
		int i = 0;
		int j = heights.length - 1;
		while(j>i) {
			ans = Math.max(ans, (j-i)*(Math.min(heights[i], heights[j])));
			if(heights[j]>heights[i]) {
				i++;
			}else {
				j--;
			}
		}
		
		return ans;
        
    }
}