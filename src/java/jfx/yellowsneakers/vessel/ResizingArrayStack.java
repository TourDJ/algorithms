package jfx.yellowsneakers.vessel;

import java.util.Iterator;

/**
 * Dynamic size stack implementation.
 * 
 * @author Hank
 *
 * @param <Item> the type of elements in this stack
 */
public class ResizingArrayStack<Item> implements ElementStack<Item>, Iterable<Item> {

	/**
	 * The array buffer into which the enties of the Stack are
     * stored. 
	 */
	private Item[] a;

	/**
	 * The number of valid enties in this {@code FixedCapacityStack} object.
	 */
	private int N;

	/**
	 * Create an empty stack with a capacity of cap.
	 * <p>
	 * Generic array is not supported in java, so we need type cast from object
	 * array.
	 * 
	 * @param cap the initial capacity of the statck
	 */
	public ResizingArrayStack(int cap) {
		a = (Item[]) new Object[cap];
	}

	/**
	 * Whether the stack is empty.
	 * 
	 * @return <tt>true</tt> if this stack contains no elements
	 */
	public boolean isEmpty() {
		return N == 0;
	}

	/**
	 * Returns the number of elements in the stack.
	 * 
	 * @return the number of elements in this stack
	 */
	public int size() {
		return N;
	}

	/**
	 * Appends the specified element to the top of this stack.
	 * <p>
	 * Push need check this stack is full first.
	 * 
	 * @param item element to be appended to this stack
	 */
	public void push(Item item) {
		// Check the capacity of this stack is too small.
		if (isFull())
			resize(2 * a.length);
		a[N++] = item;
	}

	/**
	 * Reture true if this stack is full.
	 * 
	 * @return <tt>true</tt> if this stack is full
	 */
	public boolean isFull() {
		return N == a.length;
	}

	/**
	 * Removes the top element from this stack.
	 * 
	 * @return element to be removed from this stack
	 */
	public Item pop() {
		// remove element from top of this stack
		Item item = a[--N];
		// avoiding object detach
		a[N] = null;
		if (N > 0 && N == a.length / 4)
			resize(a.length / 2);
		return item;
	}

	/**
	 * Reset stack's size when it overflow.
	 * 
	 * @param max the new capacity of this stack
	 */
	private void resize(int max) {
		// Move a stack of size N <= max into
		// a new array of size max.
		Item[] temp = (Item[]) new Object[max];
		for (int i = 0; i < N; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}
	
	/**
	 * A iterator which iterating through the array in reverse order.
	 *
	 */
	private class ReverseArrayIterator implements Iterator<Item> {

		private int i = N;
		
		public boolean hasNext() {
			return i > 0;
		}

		public Item next() {
			return a[--i];
		}
		
		public void remove() {
			
		}
	}

	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}
}
