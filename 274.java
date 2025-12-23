
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
       
        int[] count = new int[n + 1];

        for (int c : citations) {
            if (c >= n) {
                count[n]++;
            } else {
                count[c]++;
            }
        }

        int cumulative = 0;
      
        for (int h = n; h >= 0; h--) {
            cumulative += count[h]; 
            if (cumulative >= h) {
                return h;
            }
        }

        return 0;
    }
}