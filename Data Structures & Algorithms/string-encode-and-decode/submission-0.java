class Solution {

    public String encode(List<String> strs) {
    	StringBuilder sb = new StringBuilder();
    	for(String x : strs) {
    		sb.append(x.length());
    		sb.append('#');
    		sb.append(x);
    	}
    	return sb.toString();
    }

    public List<String> decode(String str) {
       StringBuilder sb = new StringBuilder(str);
       List<String> finalans = new ArrayList<>();
       for(int i = 0 ; i < sb.length() ; i++) {
    	   StringBuilder temp = new StringBuilder();
    	   while(sb.charAt(i)!='#') {
    		   temp.append(sb.charAt(i));
    		   i++;
    	   }
    	   String stemp = temp.toString();
    	   int result = Integer.parseInt(stemp);
    	   String ans = sb.substring(i + 1, i + 1 + result);
    	   finalans.add(ans);
    	   i = i + result;
       }

       return finalans;
    }
}