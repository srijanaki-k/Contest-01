class MyQueue {
    Stack<Integer> Input = new Stack<>();
    Stack<Integer> Output = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        Input.push(x);
    }
    
    public int pop() {
        if(!Output.isEmpty()){
            return Output.pop();
        }else{
            while(!Input.isEmpty()){
                Output.add(Input.pop());
            }
            return Output.pop();
        }
    }
    
    public int peek() {
        if(!Output.isEmpty()){
            return Output.peek();
        }else{
            while(!Input.isEmpty()){
                Output.add(Input.pop());
            }
            return Output.peek();
        }
    }
    
    public boolean empty() {
        return (Output.isEmpty()&&Input.isEmpty());
    }
}
