// class MinStack {

//     // data memebers
//     Stack<Integer> st ;
//     Stack<Integer> min;
    
//     public MinStack() {
//     this.st = new Stack<>() ;
//     this.min = new Stack<>() ;
    
//     }
    
//     public void push(int val) {
    
//     st.push(val);
//     if (min.isEmpty())
//     {
//     min.push(val);
//     }
//     else if(val <= min.peek())
//     {
//     min.push(val);
//     }
//     }
    
//     public void pop() {
//     if(!st.isEmpty())
//     {
//     int val = st.pop();
//     if(val == min.peek())
//     {
//     min.pop() ;
//     }
//     }
    
//     }
    
//     public int top() {
//     return st.peek();
//     }
    
//     public int getMin() {
//     return min.peek() ;
//     }
//     }
    
//     /**
//     * Your MinStack object will be instantiated and called as such:
//     * MinStack obj = new MinStack();
//     * obj.push(val);
//     * obj.pop();
//     * int param_3 = obj.top();
//     * int param_4 = obj.getMin();
//     */