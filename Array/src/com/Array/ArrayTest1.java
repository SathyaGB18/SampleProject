package com.Array;

public class ArrayTest1 {

	public static void main(String[] args) {
		/*String Name[][]= {{"Tony Stark","Thor","Captain America"},
				{"SpiderMan","SuperMan","BatMan"}};
		//System.out.println(Name.length);
		
		for (int i=0; i<Name.length; i++){
			for (int j=0; j<3; j++){
				System.out.println("arr["+i+"] ["+j+"] = "+Name[i][j]);
			}
		}*/
		String Name[][] = new String[2][3];
		Name[0][0] = "Tony Stark";
		Name[0][1] = "Thor";
		Name[0][2] = "Captain America";
		Name[1][0] = "SpiderMan";
		Name[1][1] = "SuperMan";
		Name[1][2] = "BatMan";
		
		System.out.println(Name[1][1]);
		for (String[] Name1 : Name) {
			for (String i : Name1) {
				System.out.println(i);
			}
		}
 	}

}
