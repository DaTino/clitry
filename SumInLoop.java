import java.util.Scanner;

public class SumInLoop {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Yo how many numbers you adding?");
		
		int len = sc.nextInt();
		
		int[] sumArray = new int[len];
		
		System.out.println("Please enter the numbers here: ");
		
		int total = 0;
		
		for (int i=0; i<len; i++) {
			sumArray[i] = sc.nextInt();
			total += sumArray[i];
		}
		
		System.out.println("Your total is: " + total);
	
	}

}