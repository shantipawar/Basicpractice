package com.nt;

import java.util.Arrays;


public class ArraySmallestNum {

	public static void main(String[] args) {
		int [] a = {5,1,2,4,3};
		int s =findSecondSmallest(a);
		System.out.println(+s);}
		
		public static int findSecondSmallest(int []a) {
		return Arrays.stream(a).sorted().skip(1).findFirst().orElseThrow(()->new IllegalStateException("Array is empty or only one element present"));
		
		

	}

}
