package ch8inclass;

public class Integers2 {

	public static void main(String[] args) {
		double [] numbers = new double [5];
		
		int k=0;
		for (int i=0; i<numbers.length; i++) {
			numbers[i]=Math.pow(2, i+1);
			
		}
		
		for (double x:numbers) {
			System.out.print(x);
			System.out.print(" ");
			
		}
		System.out.print("\n");
		for (int i=4; i>=0; i--) {
			System.out.print(numbers[i]);
			System.out.print(" ");
		}
	}
	

}
