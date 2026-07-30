class Solution {
    public String longestCommonPrefix(String[] strs) {
    	int min = 201;
        for(String s : strs) {
        	min = Math.min(min, s.length());
        }
        if(strs.length==1) {
        	return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        for(int x = 0 ; x < min ; x++) {
        	boolean check = false;
        	for(int i = 0 ; i < strs.length - 1; i++) {
        		if(strs[i].charAt(x) == strs[i+1].charAt(x)) {
        			check = true;
        		}else {
        			check = false;
        			break;
        		}
        	}
        	if(check == false) {
        		break;
        	}else {
        		sb.append(strs[0].charAt(x));
        	}
        }
        if(sb.isEmpty()) {
        	return "";
        }else {
        	return sb.toString();
        }
    }
}