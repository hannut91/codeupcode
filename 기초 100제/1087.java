package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		int index = 1;
		int sum = 0;
		while(true){
			if(sum>=inputNum)break;
			sum += index;
			index++;
		}
		System.out.print(sum);
	}
	

}
