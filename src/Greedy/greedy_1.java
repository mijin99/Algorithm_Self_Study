package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class greedy_1 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		//배열 총 크기 받기
		int N= scan.nextInt();
		//더해지는 총 개수 
		int M = scan.nextInt();
		// 연속으로 더할 수 있는 횟수
		int K = scan.nextInt();
		
		int arr[] =new int [N] ;
		//총 합
		int sum=0;
		//배열 입력받기
		for( int i=0;i<N;i++) {
			arr[i] =scan.nextInt(); //하나씩 입력받기
		}
		Arrays.sort(arr);
		int First = arr[N-1]; //가장 큰수
		int Second = arr[N-2]; //두번째로 큰 수
		
		/** 2중 반복문 사용으로  M이 10,000넘어가면 시간 초과! **/
		while(M>0) {
			//가장 큰 수 연속 더하기
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
