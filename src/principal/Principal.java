package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;
		a= sc.nextInt();
		b= sc.nextInt();
		char [][] mat = new char [a][b];


		for(int i=0; i<a; i++) {
			String f = sc.next();
			for (int j=0; j<b; j++) {
				mat[i][j] = f.charAt(j);
			}
		}
		for(int i=0; i<a; i++) {

			for (int j=0; j<b; j++) {
				System.out.println(mat[i][j]);
			}
		}


		int [] k = new int [b];
		for (int i=0; i<b; i++) {
			int l = sc.nextInt();
			k[i] = l;
		}
		for (int i=0; i<b; i++) {
			System.out.println(k[i]);
		}
		//		for (int i=0; i<a;i++) {
		//			for(int j=0;j<b;j++) {
		//				mat[i][j] = ;
		//			}
		//		}
	}

}
