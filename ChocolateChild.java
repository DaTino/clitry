/*	OK so make a bi-directional array, start in center-ish location. */

public class ChocolateChild {

	public static void main(String[] args) {
		
		int[][] field = new int[][] {
			{ 6, 8, 9, 7, 4},
			{ 0, 0, 8, 0, 5},
			{ 5, 7, 4, 5, 10},
			{ 4, 2, 0, 6, 9},
		};
		
		int rows = field.length;
		int clmn = field[0].length;
		System.out.println(rows+" "+clmn+" ");
		int rstart;
		int cstart;
		
		
		
		int count = 0;
		int poscurrent = 0;
		
		if (field[1][2] >= field[2][2]) {
			System.out.println(field[1][2]+"\n");
			count+=field[1][2];
			poscurrent = field[1][2];
			field[1][2] = 0;
		} else { 
			System.out.println(field[2][2]+"\n");
			count+=field[2][2];
			poscurrent = field[2][2];
			field[2][2] = 0;
		};
		

	}
}
		