package Greedy;

import java.util.*;

public class greedy_2_ans {

	public static void main(String[] args) {
		
		//시간측정 API
		long startTime = System.currentTimeMillis();
		
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int result=0;
	
		
		for(int i=0;i<N;i++) {
			int min_value= 10001;
			for(int j=0;j<M;j++) {
				int x =sc.nextInt();
				min_value =Math.min(min_value, x);
			}
			result =Math.max(result, min_value);
		}
		System.out.println(result);
		
		
		long endTime = System.currentTimeMillis();
		System.out.println("걸린시간 :"+(endTime-startTime));
		//걸린시간 5253
	}

}
