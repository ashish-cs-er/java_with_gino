package section12_array_strings;

import java.util.Arrays;

public class ArrayIntro {

	int i;
	String name;
	ArrayIntro(){
		
	}
	public ArrayIntro(int i, String name) {
		this.i=i;
		this.name = name;
	}
	public void f1() {
		int a[] = {10,67,23,45};
		int b=10;
		this.m1(a);
		this.m2(b);
		System.out.println(Arrays.toString(a));
		System.out.println("Variable b: "+b);
	}
	public void m1(int []ar) {
		//ar being a ref will point to changed array
		//any change to array will reflect in f1() method also as both ref point to same array in memory
		ar[3]=30;
	}
	public void m2(int a) {
		//a being primitive var, will set value in copy of var only.
		a=7;
	}
	
	//function returning array
	public int[] funcReturnArray() {
		int a[] = new int[5];
		for(int k=0;k<a.length;k++) {
			a[k] = (k+1)*(k+1);
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Intro to arrays");
		System.out.println("Used to store list of elements of same data types");
		System.out.println("data of differnt types cannot be stored");
		System.out.println("Can be used to store primitive and non primitive data");
		System.out.println("Created in heap memory.Declaring array means creating a ref");
		
		//syntax
		//data-type [] identifier = new data-type[size]
		int[] arr = new int[5];
		int arr1[] = new int[5];
		int []arr2 = new int[5];
		int arr3[] = {1,4,3,5,67,89}; //declaration and initialization has to be done in one line
		
		System.out.println("Size is compulsory. Otherise compile time error will come");
		System.out.println("If array is declared as instance var or static var, the created ref points to null");
		System.out.println("If array is declared as local var, the deafult value null is not assign3e4d");
		System.out.println("Every array has a property called length used to check size of array");
		System.out.println("Size of array once given cannot be given");
		System.out.println("Length is property not a function");
		System.out.println("The array elements are initialized with default values in case of primitives and null in case of non primitives");
		
		
		//accessing array elements
		System.out.println("Index of array start from 0");
		for(int j=0;j<arr3.length; j++) {
			System.out.println("value at j is: "+arr3[j]);
		}
		
		System.out.println("If we try to access index that does not exist we get, ArrayIndexOutOfBounds error");
	
		//enhanced for loop or the foreach loop
		//for(datatype varname : arrayname){}
		System.out.println("The data type of var name and arr name should match");
		System.out.println("if array has 5 elements, loop runs 5 times, if 10 elements, loop runs 10 times");
		for(int ar : arr3) {
			System.out.println("Echo arr: "+ar);
		}
		System.out.println(Arrays.toString(arr3));
		
		
		//types of arrays
		//1-D arrays, Multidimensional arrays
		System.out.println("Each element of multi dimentional array is also an array");
		System.out.println("First comes size of outer array, then size of inner array");
		
		int multiArr1[][] = new int[4][3];
		int[][] multiArr2 = new int[5][2];
		int multiArr3[][] = {{1,3,9},{2,4,6},{5,7,9},{23,45,67}};
		
		System.out.println("Ragged Array: whose outer array size remains same but inner array size keeps on changing. ITs not fixed");
		int raggedArr[][] = new int[5][];//this is valid array declaration as only ourter array size is reqd to declare array
		
		
		//Array of objects
		//datatype[] arr = new datatype[size]
		//Car[] c = new Car[4];
		
		ArrayIntro ai[] = new ArrayIntro[4];
		ai[0] = new ArrayIntro(10,"Ashsih");
		ai[1] = new ArrayIntro(20,"Kamal");
		ai[2] = new ArrayIntro(30,"Aman");
		ai[3] = new ArrayIntro(40,"Rajeev");
		System.out.println("Array is: "+Arrays.toString(ai));
		
		
		//An array is an object irrespective of data it holds
		ArrayIntro ai2 = new ArrayIntro();
		ai2.f1();
		int[] arrr = ai2.funcReturnArray();
		System.out.println("The array returned is: "+Arrays.toString(arrr));
		
		
		//Using common Array functions
		System.out.println("The Arrays class is present in java.util package");
		System.out.println("Contains common functions like searching sorting");
		
		//sorting
		int[] a = {3,67,23,89,2334};
		System.out.println("Sorting can be done on 8 primitive data types and String only");
		System.out.println("Sorting is done and stored in same array");
		Arrays.sort(a);
		System.out.println("Sorted arrys is: "+Arrays.toString(a));
		
		//binarySearch
		//Arrays.binarySearch(array, data);
		System.out.println("binarySearch return the index of the searchdata");
		System.out.println("If element not found, first sort the array, then determine where that search item should have been present and add 1 to it. whole value in negative");
		System.out.println("suppose we search 5{1,3,4,10}. as 5 is not present, first we sort the array");
		System.out.println("After sorting, the index where 5 should be is 3. So -(3+1)= -4 is returned by binarySearch");
		System.out.println("WHile comparing objects of different types, classCastException is thron");
		System.out.println("Numbers stored as string in are treated based on first digit, like 5000 would be smaller than 71");
		System.out.println("When comparing strings: 1. Numbers 2. Uppercase 3. Lowercase");
		
	}

}
