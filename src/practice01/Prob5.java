package practice01;

public class Prob5 {
	public static void main(String[] args) {
		for ( int i = 1; i < 100; i++ ) {
			// toString 메소드
			String number = Integer.toString(i);
			String clap = "";
			
			for ( int j = 0; j < number.length(); j++ ) {
				if ( number.charAt(j) == '3' || number.charAt(j) == '6' || number.charAt(j) == '9' ) {
					clap += "짝";
				}
			}
			
			if ( !clap.equals( "" ) ) {
				System.out.println( number + clap );
			}
		}
	}
}