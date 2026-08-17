class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int count = 0;
        int i = 0;
        int j = 0;
        while(i < m && j < n) {
        	if(nums1[i]<nums2[j]) {
        		ans[count] = nums1[i];
        		count++;
        		i++;
        	}else {
        		ans[count] = nums2[j];
        		count++;
        		j++;
        	}
        }
        if(i<m) {
        	while(i<m) {
        		ans[count] = nums1[i];
        		count++;
        		i++;
        	}
        }
        if(j<n) {
        	while(j<n) {
        		ans[count] = nums2[j];
        		count++;
        		j++;
        	}
        }
        for(int x = 0 ; x < m+n ; x++) {
        	nums1[x] = ans[x];
        }
    }
}