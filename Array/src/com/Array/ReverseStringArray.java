package com.Array;

class ReverseStringArray
{
    public static void main(String[] args)
    {   	
            String input = "Reversing string using temp variable";
            String reversed = reverse(input);
            System.out.println(reversed);              

    }
    public static String reverse(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }
}