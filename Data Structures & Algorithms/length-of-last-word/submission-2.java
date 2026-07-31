class Solution {
    public int lengthOfLastWord(String s) {
         int result=0;
       if(s.isEmpty()||s.length()==0||s==null){
            return result;
       }
       int end=s.length()-1;
       while(end>=0 && s.charAt(end)==' '){
            end--;
       } 
       while(end>=0 && s.charAt(end)!=' '){
            result++;
            end--;
       }
       return result;
    }
}