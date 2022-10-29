package com.Array;

public class A1ArrayTest {

	public static void main(String[] args) {
		int a[] = {5, 7, 6};
		System.out.println(a[0]);
		System.out.println(a.length);
		for(int i=0; i<a.length; i++){
			System.out.println("Print values in array: "+i);
		}
		
		int b[] = new int[5];
		b[0] = 100;
		b[1] = 98;
		b[4] = 88;
		b[2] = 42;
		b[3] = 27;
		/*b[6] = 72;//ArrayIndexOutOfBoundsException occurs because out of fixed-memory
		b[5] = 65;*/
		
		System.out.println(b[4]);
		for (int i : b) {
			System.out.println(i);
		}
	}

}
