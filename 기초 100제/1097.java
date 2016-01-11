package codeup;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int indexX = 0;
		int indexY = 0;
		int indexZ = 0;
		int base[][] = new int[19][19];

		for(indexY=0;indexY<19;indexY++){
			for(indexX=0;indexX<19;indexX++){
				base[indexY][indexX] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		int num[][] = new int[n][2];
		for(indexY=0;indexY<n;indexY++){
			for(indexX=0;indexX<2;indexX++){
				num[indexY][indexX] = sc.nextInt();
			}
		}
		for(indexZ=0;indexZ<n;indexZ++){
			for(indexY=0;indexY<19;indexY++){
				base[indexY][num[indexZ][0]-1]=base[indexY][num[indexZ][0]-1]^1;
			}
			for(indexX=0;indexX<19;indexX++){
				base[num[indexZ][1]-1][indexX]=base[num[indexZ][1]-1][indexX]^1;

			}
		}
		
		for(indexY=0;indexY<19;indexY++){
			for(indexX=0;indexX<19;indexX++){
				 System.out.print(base[indexY][indexX]+" ");
			}
			System.out.println("");
		}
		
 }
}
