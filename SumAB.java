import java.util.Scanner;

public class SumAB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two values.\nA: ");
		int A = sc.nextInt();
		System.out.println("B: ");
		int B = sc.nextInt();
		System.out.println("Sum A and B = " +(A+B));
		sc.close();
	}
}