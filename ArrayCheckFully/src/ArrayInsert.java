import java.util.Scanner;
import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the values to be added ");
		for(int i=0;i<3;i++) {
			for(int j =0;j<2;j++) {
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("The array values are :"+a[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
		
		

	}

}
