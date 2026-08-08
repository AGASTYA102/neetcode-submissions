class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums) {
        	if(!map.containsKey(x)) {
        		map.put(x, 1);
        	}else {
        		map.put(x, map.get(x)+1);
        	}
        }
        for(int i = 0 ; i <= nums.length ; i++) {
        	list.add(new ArrayList<>());
        }
        for(int x : map.keySet()) {
        	int temp = map.get(x);
        	list.get(temp).add(x);
        }
        
        int tempk = 0;
        List<Integer> tempans = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0 && tempk < k; i--) {
            for (int num : list.get(i)) {
                tempans.add(num);
                tempk++;
                if (tempk == k) {
                    break;
                }
            }
        }
        
        int[] ans = new int[tempans.size()];
        for(int i = 0 ; i  < tempans.size() ; i++) {
        	ans[i] = tempans.get(i);
        }
        return ans;
    }
}

