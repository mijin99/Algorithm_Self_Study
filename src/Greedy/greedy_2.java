package Greedy;

import java.util.Scanner;

public class greedy_2 {

	public static void main(String[] args) {
		//�ð����� API
		long startTime = System.currentTimeMillis();
		
		//�� N �� M
		Scanner sc = new Scanner(System.in);
		int N ,M;
		N= sc.nextInt();
		M=sc.nextInt();
		int [][]arr= new int[N][M];
		int min[] =new int[N];
		int row=0;
		

		
		//�迭 �Է¹ޱ�
		for(int i=0;i<N;i++) {
			min[i] =99999; //���� ū ���� ����
			for(int j=0;j<M;j++) {
				arr[i][j]=sc.nextInt();
				if(min[i] >arr[i][j]) {
					min[i] = arr[i][j]; //i��° �࿡ ���� ������ min[i]�� ����
				}				
			}
			if(row<min[i])
				row = min[i];
		}
		
		System.out.println(row);
		long endTime = System.currentTimeMillis();
		System.out.println("�ɸ��ð� :"+(endTime-startTime));
		//�ҿ�ð� 6447
		
		
		
		

	}

}
