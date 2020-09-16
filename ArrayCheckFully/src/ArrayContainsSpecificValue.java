import java.util.Arrays;
import java.util.Scanner;

public class ArrayContainsSpecificValue {
	
	public static void main(String[] args) {
		
		int[] a1 = new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert values inside the array :");
		
		for(int i =0;i<4;i++) {
			a1[i] = sc.nextInt();
		}
		
		System.out.println("Post insertion array values are : ");
		for(int a:a1)
			System.out.println(a);
		
		System.out.println(contains(a1, 11));
		
	}
	
	public static boolean contains(int[] arr,int value) {
		
		for(int check : arr) {
			if(value == check) {
				return true;
			}
			
			
		}
		return false;
		
		
	}
}
