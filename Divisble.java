package divisblityby3;

import java.util.Scanner;

public class Divisble{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arraysize = scanner.nextInt();
		System.out.print("Enter the array element");
		int array[] = new int[arraysize];
		for(int i=0;i<arraysize;i++) {
			array[i] = scanner.nextInt();
			
		}
		scanner.close();
		System.out.println(arraymod(array,arraysize));
	}
	public static int arraymod(int []array,int arraysize) {
		int result =0;
		int pow = 1;
		for(int i=arraysize-1;i>=0;i--) {
			result =(result+(array[i]%3)*pow)%3;
			pow = (pow*10)%3;
		}
		if(result == 0) {
			return 1;
		}
		return 0;
	}
}