package practice01;

public class Prob2 {
	public static void main(String[] args) {
		/*for( int i=1; i<10; i++ ) {
			for( int j=0; j<10; j++ ) {
				System.out.print( j + i + " ");
			}
			System.out.println();
		}*/

		for( int i=0; i<5; i++ ) {
			for( int j=0; j<i; j++ ) {
				System.out.print( " " );
			}
			
			for( int j=0; j<5-i; j++ ) {
				System.out.print( "*" );
			}
			System.out.println();
		}
	}
}