package Greedy;

import java.util.Scanner;

public class greedy_3_ans {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int k =sc.nextInt();
		int result=0;
		
		while(true) {
			//���� �� �ִ� �ִ� ��
			int target = (n/k) *k; //���� �� �ִ� ��ŭ �ִ��� ������ 
			System.out.println("target : "+target);
			
			//������(1�� ����� �� ȱ��)
			result +=(n-target); 
			System.out.println("result : "+result);

			//���� �� �ִ� �ִ� ��
			n=target;
			System.out.println("n : "+n);

			//�� ������ ������ ����������
			if(n<k) break;
			//k�� ������ 
			result +=1;
			System.out.println("result2 : "+result);

			//ó�� ������ ���� ��
			n /=k;
			System.out.println("n2 : "+n);

		}
		//���� ���� 1�� ���ش�.
		result += (n-1);
		System.out.println(result);
		
		long endTime = System.currentTimeMillis();
		System.out.println("����ð� : "+(endTime-startTime));
		//����ð� 1262

	}

}
