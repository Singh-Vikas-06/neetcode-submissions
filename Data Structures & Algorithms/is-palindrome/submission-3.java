class Solution {
    public boolean isPalindrome(String s) {
        String str1= s.toLowerCase().replaceAll("[^a-z0-9]","");
        Stack<Character> stack=new Stack<>();
        for(char ch: str1.toCharArray()){
            stack.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return str1.equals(sb.toString());
    }
}

