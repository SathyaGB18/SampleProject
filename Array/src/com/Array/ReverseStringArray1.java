package com.Array;

public class ReverseStringArray1 {
	static char rs;
	static String result ="";
	public static void main(String[] args)
    {
        System.out.println(reverseString("Hello World"));
    }
        // convert String to character array
        // by using toCharArray
        public static String reverseString(String data) {
        char[] text = data.toCharArray();
 
        for (int i = text.length-1; i>=0; i--){
            System.out.print(text[i]);//ouput will be in stored as characters
       // rs = text[i];
       // result = result.concat(String.valueOf(rs));
        }
        return result;
    }

}