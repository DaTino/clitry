import java.util.Scanner;

public class MinOf3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Aight brah lets fill some arrays. How long they be?");
		
		int len = sc.nextInt();
		
		int[] array1	 = new int[len];
		int[] array2	 = new int[len];
		int[] array3	 = new int[len];
		int[] compArray  = new int[len];
		
		System.out.println("Please enter the numbers here: ");
		
		for (int i=0; i<len; i++) {
			System.out.println("Triplet " + (i+1));
			array1[i] = sc.nextInt();
			array2[i] = sc.nextInt();
			array3[i] = sc.nextInt();
			
			if (array1[i] <= array2[i]) {
				if (array1[i] <= array3[i]) {
					compArray[i] = array1[i];
				}
				else compArray[i] = array3[i];	
			}
			else {
				if (array2[i] <= array3[i]) {
					compArray[i] = array2[i];
				}
				else compArray[i] = array3[i];
			}
		}
		
		System.out.println("The smallest vals are: ");
		for (int i=0; i<len; i++) {
			System.out.println(compArray[i] + " ");
		}
	
	}

}