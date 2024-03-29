//Create a Java program to merge two sorted vectors of integers into a single sorted vector.
package com.JavaCollectionFramework.Vector;
import java.util.Arrays;
import java.util.Vector;
public class MergingSortedArray {
	public static void main(String[] args) {
		Vector<Integer> V1 = new Vector<>(Arrays.asList(1,4,4,23,25,33,42,43));
		Vector<Integer> V2 = new Vector<>(Arrays.asList(1,14,24,33,45,53,62,73));

		Vector<Integer> SortedArray = new Vector<>(10);
		for(int i=0;i<V1.size();i++) {
			for(int j=i;j<V2.size();j++) {
				if(V1.elementAt(i)<=V2.elementAt(j)) {
					SortedArray.add(V1.elementAt(i));				
				}
			}
		}
		System.out.println(SortedArray);
	}

}
