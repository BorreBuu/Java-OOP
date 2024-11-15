package taulukot;

import java.util.Scanner;

public class TuntiesimToistot {

	private static final Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean lopetus = false;

		do {
			System.out.print("Lopetetaanko (1 = true, 2 = false): ");
			int loppu = lukija.nextInt();

			while (loppu < 1 || loppu > 2) {
				System.out.println("Piti syöttää 1 tai 2. Syötä luku uudestaan: ");
				loppu = lukija.nextInt();
			}
			if (loppu == 1)
				lopetus = true;

		} while (!lopetus);

	}

}
