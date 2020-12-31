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
			//나눌 수 있는 최대 값
			int target = (n/k) *k; //나눌 수 있는 만큼 최대한 나누기 
			System.out.println("target : "+target);
			
			//나머지(1씩 빼줘야 할 홧수)
			result +=(n-target); 
			System.out.println("result : "+result);

			//나눌 수 있는 최대 값
			n=target;
			System.out.println("n : "+n);

			//더 나눌게 없으면 빠져나가기
			if(n<k) break;
			//k로 나누기 
			result +=1;
			System.out.println("result2 : "+result);

			//처음 나누고 남은 수
			n /=k;
			System.out.println("n2 : "+n);

		}
		//남은 수는 1로 빼준다.
		result += (n-1);
		System.out.println(result);
		
		long endTime = System.currentTimeMillis();
		System.out.println("실행시간 : "+(endTime-startTime));
		//실행시간 1262

	}

}
