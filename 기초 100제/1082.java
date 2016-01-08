package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(16);
		for(int i=1;i<16;i++){
			System.out.println(Integer.toHexString(a).toUpperCase()+"*"+
					Integer.toHexString(i).toUpperCase()+"="+
					Integer.toHexString(a*i).toUpperCase());
		}
	}

}
