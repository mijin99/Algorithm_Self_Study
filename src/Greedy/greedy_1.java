package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class greedy_1 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		//�迭 �� ũ�� �ޱ�
		int N= scan.nextInt();
		//�������� �� ���� 
		int M = scan.nextInt();
		// �������� ���� �� �ִ� Ƚ��
		int K = scan.nextInt();
		
		int arr[] =new int [N] ;
		//�� ��
		int sum=0;
		//�迭 �Է¹ޱ�
		for( int i=0;i<N;i++) {
			arr[i] =scan.nextInt(); //�ϳ��� �Է¹ޱ�
		}
		Arrays.sort(arr);
		int First = arr[N-1]; //���� ū��
		int Second = arr[N-2]; //�ι�°�� ū ��
		
		/** 2�� �ݺ��� �������  M�� 10,000�Ѿ�� �ð� �ʰ�! **/
		while(M>0) {
			//���� ū �� ���� ���ϱ�
			for(int i=0;i<K;i++) {
				if (M==0)
					break;
				sum += First;
				M--;
			}
			if (M==0)
				break;
			sum+=Second;
			M--;
		}
		System.out.println(sum);
	}
	
}
