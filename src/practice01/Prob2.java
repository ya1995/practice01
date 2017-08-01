package practice01;

public class Prob2 {
	public static void main(String[] args) {
		for( int i=1; i<11; i++ )
		{ for( int j=0; j<10; j+=i )
			{
				System.out.print( i );
				i++;
			}
		}
	}
}