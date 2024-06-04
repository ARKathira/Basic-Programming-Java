package com.ilpbatch4.utility;
import java.util.Scanner;

public class NewPattern {
    public static void main(String[] args) {
        int input = 7;
		printpattern(input);

    }

}



package com.ilpbatch4.utility;

public class newattern {

	public static void main(String[] args) {
        int input = 7;
		printpattern(input);

	}

    private static void printpattern(int input) {
		for (int i = 0; i < input; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println(" ");
		}

	}

	

}
