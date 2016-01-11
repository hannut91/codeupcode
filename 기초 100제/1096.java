package codeup;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int indexX = 0;
		int indexY = 0;
		int base[][] = new int[19][19];
		int num[][] = new int[n][2];
		for(indexY=0;indexY<n;indexY++){
			for(indexX=0;indexX<2;indexX++){
				num[indexY][indexX] = sc.nextInt();
			}
		}
		for(indexY=0;indexY<n;indexY++){
			base[num[indexY][1]-1][num[indexY][0]-1]=base[num[indexY][1]-1][num[indexY][0]-1]^1;
			
		}
		for(indexY=0;indexY<19;indexY++){
			for(indexX=0;indexX<19;indexX++){
				 System.out.print(base[indexY][indexX]+" ");
			}
			System.out.println("");
		}
 }
}
