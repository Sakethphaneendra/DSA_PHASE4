//Create a Java function to check if a given vector of strings contains a specific element.
package com.JavaCollectionFramework.Vector;
import java.util.*;
public class VerficationVector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>(Arrays.asList("Saketh","Phone","Owl","Bat","Bus","Ballon"));
		String vaal = pass(v,"Owll");
		System.out.println(vaal);
	}
	public static String pass(Vector<String> d,String elm) {
		boolean r = d.contains(elm);
		if(r==true) {
			return "True";
		}
		return "False";
	}

}
