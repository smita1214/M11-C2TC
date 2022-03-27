package javaapplication;

public class reversePyramid {

	public static void main(String[] args) {
		for (int i=1; i<7; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print(" ");
			}
			for (int j=0; j<7-i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
