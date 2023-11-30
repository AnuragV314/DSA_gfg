import java.util.Stack;

class MyStack {
    Stack<Integer> ms;
    Stack<Integer> as;

    MyStack() {
        ms = new Stack<>();
        as = new Stack<>();
    }

    void push(int x){
        if(ms.isEmpty()){
            ms.add(x);
            as.add(x);
        }
        ms.add(x);
        if(as.peek()>=ms.peek())
            as.add(x);
    }

    void pop(){
        if(as.peek()==ms.peek())
            as.pop();
        as.pop();
    }

    int top(){
        return ms.peek();
    }

    int getMin(){
        return as.peek();
    }
}

public class GetMin {
    public static void main(String[] args) {
        MyStack s=new MyStack();;
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();
     
        System.out.print(" Minimum Element from Stack: " + s.getMin() );
  
    }
}
