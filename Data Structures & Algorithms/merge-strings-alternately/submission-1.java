class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str= new StringBuilder();
        int i=0;
        int j =0;
        while(i<word1.length() && j<word2.length()){
            str.append(word1.toCharArray()[i]);
            str.append(word2.toCharArray()[j]);
            i++;
            j++;
        }
        str.append(word1.substring(i));
        str.append(word2.substring(j));
       return str.toString();
    }
}