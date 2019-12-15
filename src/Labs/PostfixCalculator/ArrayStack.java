package Labs.PostfixCalculator;
// from Goodrich and Tamassia Data Structures and Algorithms in Java
// copyright of authors.

public class ArrayStack implements Stack {

    public static final int CAPACITY = 1000;
    private int capacity;
    private Object s[];
    private int top = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int cap) {
        capacity = cap;
        s = new Object[capacity];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public void push(Object obj) throws StackFullException {
        if (size() == capacity)
            throw new StackFullException("Stack Overflow.");
        s[++top] = obj;
    }

    public Object top() throws StackEmptyException {
        if (isEmpty())
            throw new StackEmptyException("Stack is empty.");
        return s[top];
    }

    public Object pop() throws StackEmptyException {
        Object elem;
        if (isEmpty())
            throw new StackEmptyException("Stack is empty.");
        elem = s[top];
        s[top--] = null;
        return elem;
    }

}