package codeUp;

import java.util.Scanner;

public class codeup_1034 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//10���� > n����
	//	int aa = scan.nextInt(); //���ڷ��Է� (10����)
	//	String binarynum=Integer.toBinaryString(aa); //2
	//	String octalnum=Integer.toOctalString(aa);  //8
	//	String hexnum=Integer.toHexString(aa);  //16
		
		//=----------------------------------
		//n���� > 10����
		String bb = scan.nextLine(); //�� ���� �Է�
					//���ڿ��� ���ϴ� ������ ���� 10������ ����ȯ �� ���� int ������ ����
		int octalnum10 = Integer.parseInt(bb,16);
		System.out.println(octalnum10);
	}

}
