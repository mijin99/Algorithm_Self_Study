package codeUp;

import java.util.Scanner;

public class codeup_1069 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		char str = scan.next().charAt(0); //0번쨰 글자만 char로
		switch(str) { //1문자(아스키), 정수만
			case 'A':
				System.out.println("최고");
				break;
			case 'B':
				System.out.println("b");
				break;
			case 'C':
				System.out.println("c");
				break;
			case 'D':
				System.out.println("D");
				break;
			default :
				System.out.println("what?");
			
			
		}

	}

}
