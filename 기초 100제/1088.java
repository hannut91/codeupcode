package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		int index = 1;
		while(true){
			if(inputNum<=index){
				System.out.print(index+" ");
				break;
			}
			if(index%3!=0){
			System.out.print(index+" ");
			}
			index++;
		}
	}
	

}
