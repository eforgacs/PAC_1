package Labs.linked_lists;

public class FastMaxStack<T extends Comparable<? super T>> implements MaxStack<T> {

    private ListNode<T> top;
    private ListNode<T> maxStack;

    public FastMaxStack() {
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void push(T value) {
        if (isEmpty()) {
            top = new ListNode<>(value, null);
            maxStack = new ListNode<>(value, null);
        } else {
            top = new ListNode<>(value, top);
            if (value.compareTo(maxStack.getValue()) > 0) {
                maxStack = new ListNode<>(value, maxStack);
            }
            else{
                maxStack = new ListNode<>(maxStack.value, maxStack);
            }
        }
    }

    @Override
    public T pop() {
        if (isEmpty())
            return null;
        T poppedValue = top.getValue();
        top = top.getNext();
        if (poppedValue.compareTo(maxStack.getValue()) == 0) {
            maxStack = maxStack.getNext();
        }
        return poppedValue;
    }

    @Override
    public T getMaxSoFar() {
        return maxStack.getValue();
    }


}
