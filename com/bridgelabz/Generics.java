package com.bridgelabz;

public class Generics {

	    static void maximumOfVariables(String str1, String str2, String str3){
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


    static void maximumOfVariables(Integer num1, Integer num2, Integer num3){
        if(num1.compareTo(num2) > 0){
            if(num1.compareTo(num3) > 0){
                System.out.println( num1 + " is Maximum ");
            }else {
                System.out.println( num3 + " is greater ");
            }
        }else{
            if(num2.compareTo(num3) > 0){
                System.out.println( num2 + " is maximum ");
            }else{
                System.out.println( num3 + " is maximum ");
            }
        }
    }

    static void maximumOfVariables(Float num1, Float num2, Float num3){
        if(num1.compareTo(num2) > 0){
            if(num1.compareTo(num3) > 0){
                System.out.println( num1 + " is Maximum ");
            }else {
                System.out.println( num3 + " is greater ");
            }
        }else{
            if(num2.compareTo(num3) > 0){
                System.out.println( num2 + " is maximum ");
            }else{
                System.out.println( num3 + " is maximum ");
            }
        }
    }

    public static void main(String[] args) {
       maximumOfVariables(4,5,66);
       maximumOfVariables(1.1f,2.3f,33f);
       maximumOfVariables("mango", "apple", "pineapple");
    }
	
}
