package Greedy;

import java.util.Scanner;

public class greedy_2 {

	public static void main(String[] args) {
		//시간측정 API
		long startTime = System.currentTimeMillis();
		
		//행 N 열 M
		Scanner sc = new Scanner(System.in);
		int N ,M;
		N= sc.nextInt();
		M=sc.nextInt();
		int [][]arr= new int[N][M];
		int min[] =new int[N];
		int row=0;
		

		
		//배열 입력받기
		for(int i=0;i<N;i++) {
			min[i] =99999; //가장 큰 수로 세팅
			for(int j=0;j<M;j++) {
				arr[i][j]=sc.nextInt();
				if(min[i] >arr[i][j]) {
					min[i] = arr[i][j]; //i번째 행에 가장 작은걸 min[i]에 저장
				}				
			}
			if(row<min[i])
				row = min[i];
		}
		
		System.out.println(row);
		long endTime = System.currentTimeMillis();
		System.out.println("걸린시간 :"+(endTime-startTime));
		//소요시간 6447
		
		
		
		

	}

}
