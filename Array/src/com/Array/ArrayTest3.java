package com.Array;

public class ArrayTest3 {

	public static void main(String[] args) {
		String value = "Hello+World";
		String[] V = value.split("\\+");
		for(String test : V){
			System.out.println(test);//we will get hello,world seperately
		}
		for (int i=0; i<V.length; i++){
			//System.out.println();
			System.out.println(V[i]);
			int[] var = login(V[i]);
			for (int j=0; j<var.length; j++){
				System.out.println(var[j]);
			}
		}
	}
		public static int[] login(String data){
		int[] limitx = {1,2,3,4,5};
		int[] limity = {6,7,8,9,10};
		int[] limit = {0,0,0,0,0};
		
		switch (data) {
		case "Hello":
			limit = limitx;
			//System.out.println(limit);
			break;
		case "World":
			limit = limity;
			//System.out.println(limit);
			break;
		}
		return limit;
	}

}
