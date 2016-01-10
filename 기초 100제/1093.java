package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int index=0;
		int num[] = new int[23];
		for(index=0;index<n;index++){
			num[index] = sc.nextInt();
		}
		int result[] = new int[23];
		for(index = 0;index<n;index++){
			result[num[index]-1]++;
		}
		for(index=0;index<23;index++){
			System.out.print(result[index]+" ");
		}
 }
}
