package jfx.yellowsneakers;

import jfx.yellowsneakers.lib.io.In;

public class AlgorithmsBase {

	public static void sort(Comparable[] a) {
		
	}
	
	protected static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	protected static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t; 
	}
	
	protected static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ "");
		}
		System.out.println();
	}
	
	protected static boolean isSorted(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			if(less(a[i], a[i - 1]))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] a = In.readStrings();
		sort(a);
		assert isSorted(a);
		show(a);
	}
}
