package codeUp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class codeup_1020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String  aa = scan.nextLine(); //��ĳ�ʷ� ���� �Է�
		//��ū�и� ��Ʈ��, �и� ����
		StringTokenizer st = new StringTokenizer(aa,"-"); //��ū �и�
		String result ="";
		while(st.hasMoreTokens()) {
			result += st.nextToken();
		}
		System.out.println(result);
	}

}
