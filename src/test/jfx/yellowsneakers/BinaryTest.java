package jfx.yellowsneakers;

import java.util.Arrays;

import jfx.yellowsneakers.algorithms.Algorithms;
import jfx.yellowsneakers.lib.io.In;
import jfx.yellowsneakers.lib.io.StdIn;
import jfx.yellowsneakers.lib.io.StdOut;

public class BinaryTest {

	public static void main(String[] args) {
		int[] whiteList = In.readInts(args[0]);
		Arrays.sort(whiteList);
		while (!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			if(Algorithms.binarySearch(key, whiteList) < 0)
				StdOut.println(key);
		}
	}

}
