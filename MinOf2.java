import java.util.Scanner;

public class MinOf2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Aight brah lets fill some arrays. How long they be?");
		
		int len = sc.nextInt();
		
		int[] array1	 = new int[len];
		int[] array2	 = new int[len];
		int[] compArray  = new int[len];
		
		System.out.println("Please enter the numbers here: ");
		
		for (int i=0; i<len; i++) {
			System.out.println("Pair " + (i+1));
			array1[i] = sc.nextInt();
			array2[i] = sc.nextInt();
			
			if (array1[i] <= array2[i]) {
				compArray[i] = array1[i];
			}
			else compArray[i] = array2[i];
			
		}
		
		System.out.println("The smallest vals are: ");
		for (int i=0; i<len; i++) {
			System.out.println(compArray[i] + " ");
		}
	
	}

}