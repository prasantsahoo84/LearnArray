import java.util.Arrays;

public class SortStringAndNum {
	
	public static void main(String args[]) {
		int[] my_array1 = {	10,18,3,7,50,20,100,18};
		
		String[] my_array2 = {"Kunu","Bapuni","Runu"};
		System.out.println("Original numeric array :" +Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("Sorted numeric array :"+Arrays.toString(my_array1));
		System.out.println("Original string array : "+Arrays.toString(my_array2));
		Arrays.sort(my_array2);
		System.out.println("Sorted string array is :"+Arrays.toString(my_array2));
		
	}

}
