package Greedy;

import java.util.Scanner;

public class greedy_3 {

	public static void main(String[] args) {
		//���� �ð�
		long startTime = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);
		//������ �� �� �Է�
		int N =sc.nextInt();
		//�����¼�
		int K =sc.nextInt();
		
		//�����
		int count =0;
		while(true) {
			//2��
			if(N%K==0) {
				N /=K;
				count++;
			}else {
			//1�� 
			N -=1;
			count++;
			}
			if(N==1)
				break;
		}
		System.out.println(count);
		
		long endTime = System.currentTimeMillis();
		System.out.println("����ð� : "+(endTime-startTime));
		//����ð� 3498
		
	}

}
