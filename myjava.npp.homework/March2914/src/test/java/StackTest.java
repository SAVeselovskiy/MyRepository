import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Aleks on 04.04.14.
 */
public class StackTest extends TestCase{
    Stack<Integer> stack;

    public void setUp(){
        stack=new Stack<Integer>(2);
    }
    @Test
    public void testPop() throws Exception {
        //stack = new Stack<Integer>(2);
        int res = stack.pop();
        assertEquals(2,res);
    }

    @Test
    public void testPush() throws Exception {
        Stack<Integer> stack1 = new Stack<Integer>();
        stack1.push(2);
        assertEquals(stack.peek(), stack1.peek());
    }

    @Test
    public void testPeek() throws Exception {
        int res = stack.peek();
        assertEquals(2,res);
    }

    @Test
    public void testSize() throws Exception {
        int size = stack.size();
        assertEquals(1,size);
    }
}
