/*
 * Copyright 2018-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jfx.yellowsneakers.vessel;

import java.util.Iterator;

public class LinkQueue<Item> implements Iterable<Item> {

	private Node first;
	
	private Node last;
	
	private int N;
	
	private class Node {
		Item item;
		
		Node next;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return N;
	}
	
	public void enqueue(Item item) {
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty())
			first = last;
		else
			oldLast.next = last;
	}
	
	public Item dequeue() {
		Item item = first.item;
		first = first.next;
		if(isEmpty())
			last = null;
		N--;
		return item;
	}

	public Iterator<Item> iterator() {
		return new LinkIterator();
	}
	
	private class LinkIterator implements Iterator<Item> {

		private int i = N;
		
		public boolean hasNext() {
			return i > 0;
		}

		public Item next() {
			return dequeue();
		}
		
		public void remove() {
			
		}
	}
}
