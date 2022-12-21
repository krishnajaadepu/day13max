package com.bridgelabz;

public class Generics <T extends Comparable>{

	 // type parameter extend comparable class bcz there is no compareTo method in type parameter T
    T[] array;

Generics(T[] arr1) {   // parameterized constructor is used to initialize instance variable of objects
    this.array = arr1;
}

void maximumOfVariables(){
    T largest = this.array[0];
  for (int i=0; i<this.array.length; i++){
      if(this.array[i].compareTo(largest) > 0){
          largest = this.array[i];
          this.array[i] = largest;
      }
  }
  System.out.println(" Largest element is " + largest);
}

public static void main(String[] args) {
    Integer[] arr1 = {1,1,1,1,1};
    Generics <Integer> obj1 = new Generics(arr1);
    obj1.maximumOfVariables();

    String[] arr2 = {"krishnaja", "sai", "adepu"};
    Generics <String> obj2 = new Generics(arr2);
    obj2.maximumOfVariables();

    Float[] arr3 = {1.1f, 1.2f, 1.3f};
    Generics <Float> obj3 = new Generics(arr3);
    obj3.maximumOfVariables();
}
}
