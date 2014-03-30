/**
 * Created by Aleks on 29.03.14.
 */
public interface List <Type> {
    /**
     *
     * @param element value
     * create new element in list with this value
     */
    void add(Type value);
    /**
     *
     * @param index of element
     * delete element with this index from list
     */
    Type remove();

    /**
     *
     * @return last element of list
     */
    Type peek();

}
