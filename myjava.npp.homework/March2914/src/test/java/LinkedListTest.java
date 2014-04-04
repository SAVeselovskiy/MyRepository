import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Aleks on 04.04.14.
 */
public class LinkedListTest extends TestCase {
    private LinkedList<Integer> list;
    @Test
    public void testPeek() throws Exception {
        list=new LinkedList<Integer>(4);
        int res = list.peek();
        Assert.assertEquals(4,res);
    }
    public void testAdd(){
        list = new LinkedList<Integer>(4);
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(4);
        assertEquals(list.peek(),list1.peek());
    }
    public void testRemove(){
        list = new LinkedList<Integer>(4);
        int res = list.remove();
        assertEquals(4, res);
    }
    public void testSize(){
        list=new LinkedList<Integer>(4);
        list.add(5);
        list.add(6);
        list.remove();
        assertEquals(2,list.size());
    }
}
