class Solution {
    public boolean validPalindrome(String s) {
        int count = 0;
        int i = 0;
        int j = s.length() - 1;

        while (j > i) {
            if (s.charAt(i) != s.charAt(j)) {

                // Try deleting left character
                if (check(s, i + 1, j)) {
                    return true;
                }

                // Try deleting right character
                if (check(s, i, j - 1)) {
                    return true;
                }

                return false;
            }

            j--;
            i++;
        }

        return true;
    }

    public boolean check(String s, int i, int j) {
        while (j > i) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}