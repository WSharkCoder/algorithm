import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by WSharkCoder on 2025/04/10. <br/>
 *
 * @author WSharkCoder
 * @date 2025/04/10
 */
public class P147BaoHanMinHanShuDeZhanLcof {

    class MinStack {


        Deque<Integer> xStack;
        Deque<Integer> minStack;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            xStack = new LinkedList<>();
            minStack = new LinkedList<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            xStack.push(x);
            minStack.push(Math.min(minStack.peek(), x));
        }

        public void pop() {
            xStack.pop();
            minStack.pop();
        }

        public int top() {
            return xStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
