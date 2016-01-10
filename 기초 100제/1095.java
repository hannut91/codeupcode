package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int index = 0;
		
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		for(index=0;index<n;index++){
			num[index] = sc.nextInt();
		}
		temp = num[0];
		for(index=0;index<n;index++){
			if(temp>num[index])temp = num[index];
		}
		System.out.print(temp);
 }
}
