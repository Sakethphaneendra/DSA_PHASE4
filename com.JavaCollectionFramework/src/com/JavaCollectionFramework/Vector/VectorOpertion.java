package com.JavaCollectionFramework.Vector;

import java.util.*;
public class VectorOpertion {

	public static void main(String[] args) {
		Vector<String> V = new Vector<String>();	
		V.add("Y1");
		V.add("Y2");
		V.add("Y3");
		Vector<String> V2 = new Vector<String>(30);	
		V2.add("S1");
		V2.add("S2");
		V2.add("S3");
		V2.add("S4");
		V.addAll(V2);
		System.out.println(V.contains("S2"));
		V.remove("Y3");
		System.out.println(V.get(1));

		System.out.println(V);
		System.out.println(V2.size() + " \n" + V2.capacity());
		Object [] arr = new Object[8];
		arr[0] =3;
		arr[1] =13;
		arr[2] =23;
		arr[3] =33;
		arr[4] =43;
		Vector<String> D = new Vector<String>();
		System.out.println(D.size() + " \n" + D.capacity());	
		
	}

}

