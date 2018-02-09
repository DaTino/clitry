import java.util.Scanner;

public class CompileTry {
	public static void main (String[] args) {
	
		System.out.println("The fuck is your name honky: ");
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		System.out.println("Ain't nobody dope as" + name);
		sc.close();
	}
}