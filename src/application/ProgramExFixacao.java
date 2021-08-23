package application;

import java.util.Scanner;

import entities.Rent;

public class ProgramExFixacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rent[] room = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("%nRent #%d:%n", i);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Room: ");
			int indexOfChoosedRoom = sc.nextInt() - 1;

			room[indexOfChoosedRoom] = new Rent(name, email);
		}

		System.out.println("\nBusy Rooms: ");
		for (int i = 0; i < room.length; i++) {
			if (room[i] != null) {
				System.out.printf("%d: %s%n", (i + 1), room[i].toString());
			}
		}

		sc.close();

	}

}
