class MinStack {
    Stack<Integer> stack;
    Stack<Integer> stack1;
    public MinStack() {
        stack = new Stack<>();
        stack1 = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(stack1.isEmpty()){
            stack1.push(val);
        }else{
            stack1.push(Math.min(val,stack1.peek()));
        }
    }
    
    public void pop() {
        stack.pop();
        stack1.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stack1.peek();
    }
}
