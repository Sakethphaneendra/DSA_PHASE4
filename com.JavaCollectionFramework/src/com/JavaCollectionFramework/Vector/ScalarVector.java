//Create a Java program to perform scalar multiplication on a vector of integers by a given 
//scalar value.
package com.JavaCollectionFramework.Vector;
import java.util.Arrays;
import java.util.Vector;
public class ScalarVector {
	public static void main(String[] args) {
		Vector<Integer> V = new Vector<>(Arrays.asList(2,4,1,5,7,32));
		int number = 2;
		System.out.println(V);
		for(int i=0;i<V.size();i++) {
			V.set(i, V.get(i)*number);
		}
		System.out.println(V);
	}

}
