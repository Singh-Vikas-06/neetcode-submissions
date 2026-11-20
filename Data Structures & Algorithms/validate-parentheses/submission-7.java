class Solution {
    public boolean isValid(String s) {
        Stack<Character>set=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                set.push(ch);
            }
            else{
                if(set.isEmpty()) return false;
                char top=set.pop();
                
                if((ch==')' && top!='(')||
                (ch=='}' && top!='{')||
                (ch==']' && top!='[')){
                    return false;
                }
                
            }
        }
        return set.isEmpty();
    }
}