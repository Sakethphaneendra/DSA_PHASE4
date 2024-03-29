//Implement a Java method to find the maximum element in a vector of doubles.
package com.JavaCollectionFramework.Vector;
import java.util.*;
public class DoubleDatatypeVector {
	public static void main(String ar[]) {
		 Vector<Double> V = new Vector<>(Arrays.asList(134.3,3435.65,54543.2,434.4));
		 Double max =0.0;
		 for (Double n : V) {
			    if (max < n) {
			        max = n;
			    }
			}
		 System.out.println(max);
	}
}
