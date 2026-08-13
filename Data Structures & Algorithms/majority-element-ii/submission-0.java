class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums) {
        	if(!map.containsKey(x)){
        		map.put(x, 1);
        	}else {
        		map.put(x,map.get(x)+1);
        	}
        }
        int k = nums.length/3;
        for(int x : map.keySet()) {
        	if(map.get(x)>k) {
        		ans.add(x);
        	}
        }
        return ans;
    }
}