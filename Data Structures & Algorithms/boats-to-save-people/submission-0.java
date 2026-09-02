class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int j = 0;
        int k = people.length - 1;
        int ans = 0;

        while (j <= k) {

            // The heaviest person gets a boat
            if (people[j] + people[k] <= limit) {
                j++;
            }

            k--;
            ans++;
        }

        return ans;
    }
}