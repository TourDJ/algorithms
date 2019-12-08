package jfx.yellowsneakers;

import jfx.yellowsneakers.lib.io.StdIn;
import jfx.yellowsneakers.lib.io.StdOut;
import jfx.yellowsneakers.vessel.FixedCapacityStack;

public class FixedStackTest {

	public static void main(String[] args) {
		FixedCapacityStack<String> s = new FixedCapacityStack<>(100);
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) {
				s.push(item);;
			} else if (!s.isEmpty()) {
				StdOut.print(s.pop() + " ");
			}
		}
		StdOut.println("(" + s.size() + " left on stack)");
	}

}
