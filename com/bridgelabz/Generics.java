package com.bridgelabz;

public class Generics {

	    static <P extends Comparable> void maximumOfVariables( P str1, P str2, P str3){
        
        // compareTo method is defined in Comparable class
        // bcz compareTo method is not available for Generics type, we will inherit the method from Comparable class.


        if(str1.compareTo(str2) > 0){
            if(str1.compareTo(str3) > 0){
                System.out.println( str1 + " is Maximum ");
            }else {
                System.out.println( str3 + " is greater ");
            }
        }else{
            if(str2.compareTo(str3) > 0){
                System.out.println( str2 + " is maximum ");
            }else{
                System.out.println( str3 + " is maximum ");
            }
        }
    }


    public static void main(String[] args) {
       maximumOfVariables();
       maximumOfVariables();
       maximumOfVariables("mango", "apple", "pineapple");
    }


}
