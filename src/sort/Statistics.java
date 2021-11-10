package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Statistics {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[8001];
		
		int sum = 0;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		int median = 10000; //중앙
		int mode = 10000;	//최빈값
		
		for(int i=0; i< n; i++) {
			int value = Integer.parseInt(br.readLine());
			sum += value;
			arr[value + 4000]++;
			
			if(max < value) {
				max = value;
			}
			if(min > value) {
				min = value;
			}
		}
		
		 int count = 0;	//중앙값 빈도 누적수
		 int mode_max = 0; // 최빈값의 최대값
		 
		 boolean flag = false;
		 
		 for(int i= min+4000; i<=max+4000; i++) {
			 
			 if(arr[i] > 0) {
				 if(count < (n+1) / 2) {
					 count += arr[i];
					 median = i - 4000;
				 }
				 if(mode_max < arr[i]) {
					 mode_max = arr[i];
					 mode = i - 4000;
					 flag = true;
				 }
				 else if(mode_max == arr[i] && flag == true) {
					 mode = i - 4000;
					 flag = false;
				 }
			 }
		 }
		 
		 System.out.println((int)Math.round((double)sum / n));
		 System.out.println(median);
		 System.out.println(mode);
		 System.out.println(max-min);
	}

}
