/**
 * Created by Aleks on 30.03.14.
 */
public class Stack<Type> implements  StackInterface<Type>{
    private LinkedList<Type> List;
    Stack(){
        List=new LinkedList<Type>();
    }
    Stack(Type value){
        List=new LinkedList<Type>();
        List.add(value);
    }
    Stack(Stack original){
        List=new LinkedList<Type>(original.List);
    }
    @Override
    public Type pop() {
        Type result = this.List.remove();
        return result;
    }

    @Override
    public void push(Type val) {
        this.List.add(val);
    }

    @Override
    public Type peek() {
        return this.List.peek();
    }

    @Override
    public long size() {
        return this.List.size();
    }
}
