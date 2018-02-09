import java.util.Scanner;

public class SumsInLoops {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Yo how many numbers you adding?");
		
		int len = sc.nextInt();
		
		int[] sumArray1 = new int[len];
		int[] sumArray2 = new int[len];
		int[] totArray  = new int[len];
		
		System.out.println("Please enter the numbers here: ");
		
		for (int i=0; i<len; i++) {
			System.out.println("Pair " + (i+1));
			sumArray1[i] = sc.nextInt();
			sumArray2[i] = sc.nextInt();
			totArray[i] = sumArray1[i] + sumArray2[i];
		}
		
		System.out.println("The sums are: ");
		for (int i=0; i<len; i++) {
			System.out.println(totArray[i] + " ");
		}
	
	}

}