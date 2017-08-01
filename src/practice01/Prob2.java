package practice01;

public class Prob2 {
	public static void main(String[] args) {
		for ( int i = 1; i < 11; i++ ) {
			for ( int j = i + 1; j < j + 12; j++ ) {
				System.out.print(i);
				i++;
			}
			System.out.println();
		}
	}
}