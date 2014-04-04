/**
 * Created by Sergey on 29.03.14.
 */
public class LinkedList <Type> implements List<Type>{
    Refer<Type> head;
    Refer<Type> tail;

    private class Refer <Type> {
        Type value;
        Refer<Type> next;
        Refer(){
        }
        Refer(Type value){
            this.value=value;
        }
        Refer(Type value, Refer<Type> next){
            this.value=value;
            this.next=next;
        }

    }

    /**
     * Append list
     * @param value
     */
    @Override
    public void add(Type value) {
        Refer<Type> temp=new Refer<Type>(value);
        if (tail==head){
            head=temp;
            head.next=tail;
            tail.next=head;
            return;
        }
        temp.next=tail;
        tail.next.next=temp;
        tail.next=temp;
    }

    /**
     * Delete last element of list
     * @return value of deleted element
     */
    @Override
    public Type remove() {
        Refer<Type> temp=head;
        for(int i=1 ;temp.next!=tail.next;temp=temp.next,i++){  //find previous element
        }
        Type res=temp.next.value;

        if(temp.next.next==tail){
            temp.next=tail;
            tail.next=temp;
        }
        else if (temp==head){
            head=temp.next ;
        }

        return res;
    }

    /**
     *
     * @return size of list
     */
    public int size() {
        Refer<Type> temp=head;
        int size=0;
        for(;temp!=tail;temp=temp.next,size++){

        }
        return size;

    }


    /**
     *
     * @return last element of list
     */
    @Override
    public Type peek() {
        return tail.next.value;
    }

    LinkedList(Type val){
        head = new Refer<Type>(val);
        tail=head;
        Refer<Type> temp= new Refer<Type>(val,tail);
        head=temp;
        tail.next=head;
    }
    LinkedList(){
        head = new Refer<Type>();
        tail=head;
    }

    LinkedList(LinkedList<Type> original){
        Refer<Type> temp=original.head;
        this.head=new Refer<Type>();
        this.tail=this.head;
        for(;temp!=original.tail; temp=temp.next) {
            this.add(temp.value);
        }
    }
}
