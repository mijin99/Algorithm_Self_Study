package codeUp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class codeup_1020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String  aa = scan.nextLine(); //스캐너로 문장 입력
		//토큰분리 스트링, 분리 지정
		StringTokenizer st = new StringTokenizer(aa,"-"); //토큰 분리
		String result ="";
		while(st.hasMoreTokens()) {
			result += st.nextToken();
		}
		System.out.println(result);
	}

}
