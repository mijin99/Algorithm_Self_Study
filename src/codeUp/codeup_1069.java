package codeUp;

import java.util.Scanner;

public class codeup_1069 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		char str = scan.next().charAt(0); //0���� ���ڸ� char��
		switch(str) { //1����(�ƽ�Ű), ������
			case 'A':
				System.out.println("�ְ�");
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
