package codeup;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		for(index=0;index<n;index++){
			num[index] = sc.nextInt();
		}
		for(index=n-1;index>=0;index--){
			System.out.print(num[index] + " ");
		}
	
 }
}
