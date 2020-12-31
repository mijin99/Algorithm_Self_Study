package Greedy;

import java.util.Scanner;

public class greedy_3 {

	public static void main(String[] args) {
		//시작 시간
		long startTime = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);
		//나누어 질 수 입력
		int N =sc.nextInt();
		//나누는수
		int K =sc.nextInt();
		
		//실행수
		int count =0;
		while(true) {
			//2번
			if(N%K==0) {
				N /=K;
				count++;
			}else {
			//1번 
			N -=1;
			count++;
			}
			if(N==1)
				break;
		}
		System.out.println(count);
		
		long endTime = System.currentTimeMillis();
		System.out.println("실행시간 : "+(endTime-startTime));
		//실행시간 3498
		
	}

}
