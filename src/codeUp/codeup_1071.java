package codeUp;

import java.util.Scanner;

public class codeup_1071 {
	public static void main(String[] args) {
		number0();
	}
	//메인이 static 인데 static안에서 사용하려면 static 이 되어야함(인스턴스 불가)
	static void number0() {
		Scanner scan = new Scanner (System.in);
		int num =scan.nextInt();
		if(num==0)
			return ;
		System.out.println(num);
		number0();
	}
}
