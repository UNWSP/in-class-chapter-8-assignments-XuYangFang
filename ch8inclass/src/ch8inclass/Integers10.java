package ch8inclass;

public class Integers10 {

	public static void main(String[] args) {
		int [] numbers = {10,20,30,40,50,60};
		
			for (int x : numbers) {
				
				System.out.print( x );
				System.out.print(" ");
				
			}
				System.out.print("\n");
			
			for (int i = numbers.length-1; i >= 0; i-- ) {
				System.out.print(numbers[i] + " ");
				
			}
		
			
		int sum =0;
		for (int value : numbers) {
			sum +=value;
			
			
		}
		System.out.print("\n" + sum);
		
		
		int add = 0;
		for(int i=0; i<numbers.length; i++) {
			
			add = add + numbers[i];
			
		}
			double avg = add/numbers.length;
			System.out.print("\n" + avg);
		
}
}

