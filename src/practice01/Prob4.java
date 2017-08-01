package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "문자열을 입력하세요 : " );
		String text = scanner.nextLine();
		
		for( int i=1; i<=text.length(); i++ ) {
			for( int j=0; j<i; j++ ) {
				String result = text.toUpperCase();
				System.out.print(result.charAt(j));
			}
			System.out.println();
		}
		
		scanner.close();
	}
}