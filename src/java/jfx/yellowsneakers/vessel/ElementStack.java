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

/**
 * Inteface of customize stack.
 * 
 * @author Hank
 *
 * @param <Item> the type of elements in this stack
 */
public interface ElementStack<Item> {

	/**
	 * Whether the stack is empty.
	 * 
	 * @return <tt>true</tt> if this stack contains no elements
	 */
	public boolean isEmpty();

	/**
	 * Returns the number of elements in the stack.
	 * 
	 * @return the number of elements in this stack
	 */
	public int size();

	/**
	 * Appends the specified element to the top of this stack.
	 * <p>
	 * Push need check this stack is full first.
	 * 
	 * @param item element to be appended to this stack
	 */
	public void push(Item item);

	/**
	 * Removes the top element from this stack.
	 * 
	 * @return element to be removed from this stack
	 */
	public Item pop();

}
