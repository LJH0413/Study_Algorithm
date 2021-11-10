package Recursion_Funtion;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();

		System.out.println(fibo(N));
	}

	public static int fibo(int n) {
		if(n <= 1) {
			return n;
		}
		else {
			return fibo(n-1) + fibo(n-2);
		}
	}

}
