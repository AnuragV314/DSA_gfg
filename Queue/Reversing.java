import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Stack; 



public class Reversing {

    static Queue<Integer> queue; 
 
    static void Print(){
        for(Integer x: queue)
            System.out.println(x + " ");
    }

    // Recursive
    static void reversequeue(){
        Stack<Integer> stack = new Stack<>();

        while(!queue.isEmpty()){
            stack.add(queue.peek());
            queue.remove();
        }

        while(!stack.isEmpty()){
            queue.add(stack.peek());
            stack.pop();
        }
    }


    // Iterative

    static void reverse (Queue<Integer> q){
        if (queue.isEmpty())
            return;
        
        int  x = queue.peek();
        queue.remove();

        reverse(queue);
        queue.add(x);
    }

    public static void main(String[] args) {
        queue = new LinkedList<Integer>(); 
		queue.add(12); 
		queue.add(5); 
		queue.add(15); 
		queue.add(20); 
	
		// reversequeue(); 
        reverse(queue);
		Print(); 
    }
}
