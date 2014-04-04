/**
 * Created by Aleks on 29.03.14.
 */
public interface StackInterface<Type> {
    /**
     *
     * @return link to value field of element
     * <br/>
     * Remove first element from stack
     */
    Type pop();
    /**
     *
     * @param val
     * Adds new element in Stack
     */
    void push (Type val);
    /**
     *
     * @return link to field "value" of element
     * <br/>
     * return link to field "value" of first element in Stack
     */
    Type peek();

    int size();
}