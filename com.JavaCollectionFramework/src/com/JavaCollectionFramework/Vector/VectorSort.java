// Write a Java program to sort a vector of integers in ascending order without using any
//built-in sorting functions.
// Time complexity O(n^2)
package com.JavaCollectionFramework.Vector;
import java.util.Arrays;
import java.util.Vector;
public class VectorSort {

	public static void main(String[] args) {
		Vector<Integer> V = new Vector<>(Arrays.asList(1,4,1,54,7,23,87,23,85));
		for(int i=0;i<V.size();i++) {
			for(int j=i;j<V.size();j++) {
				if(V.elementAt(i)>V.elementAt(j)) {
					int temp = V.elementAt(i);
					V.set(i,V.elementAt(j));
					V.set(j,temp);
					
				}
			}
		}
		System.out.println(V);
	}

}
