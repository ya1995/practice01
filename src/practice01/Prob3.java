package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner( System.in  );
		while(true) {
			System.out.println( "숫자를 입력하세요:" );
			int number = scanner.nextInt();
			for( int i = number-2; i>0; i-=2 ) {
				number += i;
				
			}
			System.out.println( "결과 값 : " + number );
			System.out.println( " " );
			
		}
	}
}