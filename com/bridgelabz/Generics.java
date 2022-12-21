package com.bridgelabz;

public class Generics <T extends Comparable>{

	 // type parameter extend comparable class bcz there is no compareTo method in type parameter T

    T variable1;
    T variable2;
    T variable3;

    Generics(T var1, T var2, T var3){   // parameterized constructor is used to initialize instance variable of objects
        this.variable1 = var1;
        this.variable2 = var2;
        this.variable3 = var3;
    }

    void maximumOfVariables(){
        if(this.variable1.compareTo(this.variable2) > 0){
            if(this.variable1.compareTo(this.variable3) > 0){
                System.out.println( this.variable1 + " is Maximum ");
            }else {
                System.out.println( this.variable3 + " is greater ");
            }
        }else{
            if(this.variable2.compareTo(this.variable3) > 0){
                System.out.println( this.variable2 + " is maximum ");
            }else{
                System.out.println( this.variable3 + " is maximum ");
            }
        }
    }

    public static void main(String[] args) {
       Generics <Integer> obj1 = new Generics(4,5,66);
       obj1.maximumOfVariables();

       Generics <String> obj2 = new Generics("mango", "apple", "pineapple");
       obj2.maximumOfVariables();

       Generics <Float> obj3 = new Generics(1.1f,2.3f,33f);
       obj3.maximumOfVariables();
    }
}
