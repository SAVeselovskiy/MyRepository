/**
 * Created by Aleks on 03.04.14.
 */
public class Program {

    public void main(){
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<5; i++){
            stack.push(i);
        }

        for(int i = 0; i < 5; i++){
            System.out.print(stack.pop() + " ");
        }

    }
}
