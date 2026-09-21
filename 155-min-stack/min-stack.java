class MinStack {
    private Stack<Integer> main;
    private Stack<Integer> min;
    public MinStack() {
        main = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int value) {
        main.push(value);
        if(min.isEmpty()){
            min.push(value);
        }
        else{
            min.push(Math.min(value,min.peek()));
        }
    }
    
    public void pop() {
       main.pop();
       min.pop();
    }
    
    public int top() {
       return  main.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */