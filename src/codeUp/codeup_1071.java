package codeUp;

import java.util.Scanner;

public class codeup_1071 {
	public static void main(String[] args) {
		number0();
	}
	//������ static �ε� static�ȿ��� ����Ϸ��� static �� �Ǿ����(�ν��Ͻ� �Ұ�)
	static void number0() {
		Scanner scan = new Scanner (System.in);
		int num =scan.nextInt();
		if(num==0)
			return ;
		System.out.println(num);
		number0();
	}
}
