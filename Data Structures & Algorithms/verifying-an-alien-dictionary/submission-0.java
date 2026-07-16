class Solution {
    public boolean isAlienSorted(String[] words, String order) {

        int[] rank = new int[26];

        // Store the rank of each character
        for (int i = 0; i < order.length(); i++) {
            rank[order.charAt(i) - 'a'] = i;
        }

        // Compare every adjacent pair
        for (int i = 0; i < words.length - 1; i++) {

            String word1 = words[i];
            String word2 = words[i + 1];

            if (!isSorted(word1, word2, rank)) {
                return false;
            }
        }

        return true;
    }

    private boolean isSorted(String word1, String word2, int[] rank) {

        int len = Math.min(word1.length(), word2.length());

        for (int i = 0; i < len; i++) {

            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);

            if (c1 != c2) {
                return rank[c1 - 'a'] < rank[c2 - 'a'];
            }
        }

        // Prefix case
        return word1.length() <= word2.length();
    }
}