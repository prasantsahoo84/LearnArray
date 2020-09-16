import java.util.Arrays;
import java.util.Scanner;


public class ArrayAverage {
	
	public static void main(String[] args) {
		
		int[] a1 = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the element inside the array :");
		for(int i=0;i<5;i++) {
			
			
			a1[i] = sc.nextInt();
			
		}
		
		System.out.println("Post insertion  array values are :");
		for(int i : a1)
			System.out.println(i);
		
		int sum = 0;
		for(int j = 0;j<a1.length;j++) {
			
			sum = sum + a1[j];
			
		}
		System.out.println("Total array value is :" +sum);
		System.out.println("Average of the array is :"+ sum/a1.length);
		
	}

}
