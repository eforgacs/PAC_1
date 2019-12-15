package Labs.PostfixCalculator;
// from Goodrich and Tamassia Data Structures and Algorithms in Java
// copyright of authors.

public interface Stack {

    public int size();

    public boolean isEmpty();

    public Object top() throws StackEmptyException;

    public void push(Object element);

    public Object pop() throws StackEmptyException;

}
