package codeUp;

import java.util.Scanner;

public class codeup_1034 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//10진수 > n진수
	//	int aa = scan.nextInt(); //숫자로입력 (10진수)
	//	String binarynum=Integer.toBinaryString(aa); //2
	//	String octalnum=Integer.toOctalString(aa);  //8
	//	String hexnum=Integer.toHexString(aa);  //16
		
		//=----------------------------------
		//n진수 > 10진수
		String bb = scan.nextLine(); //한 문장 입력
					//문자열을 원하는 진수에 맞춰 10진수로 형변환 한 것을 int 변수에 넣음
		int octalnum10 = Integer.parseInt(bb,16);
		System.out.println(octalnum10);
	}

}
