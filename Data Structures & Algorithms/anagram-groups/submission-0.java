class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    	Map<String, List<String>> map = new HashMap<>();

    	for (String s : strs) {
    	    int[] count = new int[26];

    	    for (char c : s.toCharArray()) {
    	        count[c - 'a']++;
    	    }

    	    String key = Arrays.toString(count);
    	    map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
    	}
    	List<List<String>> ans = new ArrayList<>();
    	for(List<String> x : map.values()) {
    		ans.add(x);
    	}
    	return ans;
    }
}