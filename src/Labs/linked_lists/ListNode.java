package Labs.linked_lists;

public class ListNode<T> {
    public T value;
    public ListNode<T> next;

    public ListNode(T value, ListNode<T> next) {
        this.value = value;
        this.next = next;
    }

    public ListNode<T> setValue(T value) {
        return new ListNode<>(value, this);
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public ListNode<T> getNext() {
        return this.next;
    }

    public T getValue() {
        return this.value;
    }


}

