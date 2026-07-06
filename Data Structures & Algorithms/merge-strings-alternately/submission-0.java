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
        if(word1.length()>=word2.length()){
            while(i<word1.length()){
                 str.append(word1.toCharArray()[i]);
                 i++;
            }
        }else {
            while(j<word2.length()){
                str.append(word2.toCharArray()[j]);
                j++;
            }
        }
       return str.toString();
    }
}