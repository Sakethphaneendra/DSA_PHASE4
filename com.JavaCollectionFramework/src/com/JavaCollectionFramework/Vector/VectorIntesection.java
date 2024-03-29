//Implement a Java method to find the intersection of two vectors of integers (common elements).
package com.JavaCollectionFramework.Vector;
import java.util.Arrays;
import java.util.Vector;
public class VectorIntesection {

	public static void main(String[] args) {
		Vector<Integer> V1 = new Vector<>(Arrays.asList(2,6,8,24,5,23,74,23));
		Vector<Integer> V2 = new Vector<>(Arrays.asList(2,23,24));
		Intersection(V1,V2);
	}
	public static void Intersection(Vector<Integer> A , Vector <Integer> B) {
		for(int n : A) {
			for(int n2 : B) {
				if(n==n2) {
				System.out.println(n);	
				}
			}
		}
	}

}
