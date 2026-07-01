class Solution {
    public boolean isAnagram(String s, String t) {
    char[] freq1=s.toCharArray();
    char[] freq2=t.toCharArray();
    Arrays.sort(freq1);
    Arrays.sort(freq2);
    return Arrays.equals(freq1,freq2);
    }
}
   
