
//Write a Java program to create a vector and add elements to it dynamically. 
//Display the elements of the vector.

package com.JavaCollectionFramework.Vector;
import java.util.*;
public class VectorProgram1 {

	public static void main(String[] args) {
		Vector<Integer> V = new Vector<>(5);
		Scanner in = new Scanner(System.in);
		for(int i=0;i<8;i++) {
			System.out.print("Enter the Element : ");
			V.add(in.nextInt());
			System.out.println("Array Elements : " + V + "  Array Capacity : "+V.capacity());
		}
		in.close();
		System.out.println("Done");
	}
}
