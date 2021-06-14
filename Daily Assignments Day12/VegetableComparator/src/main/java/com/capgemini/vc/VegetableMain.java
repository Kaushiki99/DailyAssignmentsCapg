package com.capgemini.vc;

import com.capgemini.vc.services.VegetableServices;

import java.util.Scanner;

public class VegetableMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VegetableServices vs = new VegetableServices();
		char choice = 'y';
		while (choice == 'y') {
			System.out.println("Press: ");
			System.out.println("1. Create");
			System.out.println("2. Read");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Sort");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				vs.createVegetable();
				break;
			case 2:
				vs.read();
				break;
			case 3:
				vs.update();
				break;
			case 4:
				vs.delete();
				break;
			case 5:
				vs.sort();
				break;
			}
			System.out.println("Do you want to try again? (y/n)");
			choice = sc.next().trim().charAt(0);
		}
		sc.close();
	}

}
