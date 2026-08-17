class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb1 = new StringBuilder(word1);
        StringBuilder sb2 = new StringBuilder(word2);
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i < sb1.length() && j < sb2.length()) {
        	ans.append(sb1.charAt(i));
        	i++;
        	ans.append(sb2.charAt(j));
        	j++;
        }
        if(i < sb1.length()) {
        	while(i<sb1.length()) {
        		ans.append(sb1.charAt(i));
				i++;
        	}
        }
        if(j < sb2.length()) {
        	while(j<sb2.length()) {
        		ans.append(sb2.charAt(j));
				j++;
        	}
        }
        return ans.toString();
    }
}