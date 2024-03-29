package com.JavaCollectionFramework.Vector;
import java.util.*;
public class VectorSum {

	public static void main(String[] args) {
		Vector<Integer> V = new Vector<>(Arrays.asList(4,2,5,2,54,2,3,1,7,20));
		int sum =0;
		for(int num : V)
			sum+=num;
		System.out.println("The Total Sum : "+sum);
	}

}
