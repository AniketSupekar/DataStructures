import java.util.Stack;

public class Stacks4 {
    
    public static void pushAtBottom(int data , Stack<Integer> s) {
        if(s.isEmpty()) 
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data , s);
        s.push(top);
    }

    public static void main(String[] args) {

         Stack<Integer> s = new Stack<>();
         s.push(1);
         s.push(2);
         s.push(3);
         pushAtBottom(4, s);
    }
}
