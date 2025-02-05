package studio3;

import java.util.Scanner;

public class SieveofEratosthenes {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give n: ");
		int n = in.nextInt();
		
		boolean[] numbers = new boolean[n + 1];
		for (int i = 2; i < n; i++) {
			numbers[i] = true;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (numbers[i] = true) {
				for(int j = i*i; j < n; j+= i) {
					numbers[j] = false;
					
				}
				
			}
			if (numbers [i] == true) {
			System.out.println(i);		
			}
		}
		
	}
	

}
