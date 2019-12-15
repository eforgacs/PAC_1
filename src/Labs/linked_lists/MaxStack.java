package Labs.linked_lists;

public interface MaxStack<T> {
	boolean isEmpty();
	
	void push(T value);
	
	T pop();
	
	T getMaxSoFar();
}
