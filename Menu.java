package finalphonebook;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Menu {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Phonebook p1 = new Phonebook();
		int choice = 0;
		int answer = 0;
		String phoneNum;
		String firstName = null;
		String middleName = " ";
		String lastName = null;
		String streetNum = null;
		String streetName;
		String city;
		String state;
		String zip;
		String fullName;

		while (choice != 5) {
			try {
				choice = menu();
				switch (choice) {
				case 1:
					System.out.println(
							"Add a contact with this format: First Name: Middle Name: Last Name: Street Number: Street Name: City: State: Zip: Phone Number: ");
					String info = sc.nextLine();
					Scanner scan = new Scanner(info);
					scan.useDelimiter(",");

					fullName = scan.next().trim();
					// streetNum = scan.next();
					streetName = scan.next().trim();
					city = scan.next().trim();
					state = scan.next().trim();
					zip = scan.next().trim();
					phoneNum = scan.next().trim();
					String[] splitString = fullName.split(" ");
					if (splitString.length == 2) {
						firstName = splitString[0];
						lastName = splitString[1];

					}
					if (splitString.length == 3) {
						firstName = splitString[0];
						middleName = splitString[1];
						lastName = splitString[2];
					}
					if (splitString.length == 4) {
						firstName = splitString[0];
						middleName = splitString[1] + " " + splitString[2];
						lastName = splitString[3];
					}
					Person person = new Person(phoneNum, firstName, middleName, lastName, streetNum, streetName, city,
							state, zip);

					p1.addPerson(person);
					break;

				case 2:
					p1.printAlphabetArray();
					break;
				case 3:
					System.out.println("You have selected to search an existing entry.");
					System.out.println("Enter 1 to search by first name");
					System.out.println("Enter 2 to search by last name");
					System.out.println("Enter 3 to search by phone number");
					System.out.println("Enter 4 to search by city");
					System.out.println("Enter 5 to search by state");
					answer = sc.nextInt();
					switch (answer) {

					case 1:
						sc.nextLine();
						System.out.println("Enter the first name");
						firstName = sc.nextLine();
						Phonebook.searchForPerson(1, firstName);
						break;
					case 2:
						sc.nextLine();
						System.out.println("Enter the last name");
						lastName = sc.nextLine();
						Phonebook.searchForPerson(2, lastName);
						break;
					case 3:
						sc.nextLine();
						System.out.println("Enter the phone number");
						phoneNum = sc.nextLine();
						Phonebook.searchForPerson(3, phoneNum);
						break;
					case 4:
						sc.nextLine();
						System.out.println("Enter the phone number");
						city = sc.nextLine();
						Phonebook.searchForPerson(4, city);
						break;
					case 5:
						sc.nextLine();
						System.out.println("Enter the phone number");
						state = sc.nextLine();
						Phonebook.searchForPerson(5, state);
						break;

					}
					break;
				case 4:
					System.out.println("You have selected to remove an existing entry");
					
					System.out.println("Enter 1 to remove by phone number");
					answer = sc.nextInt();
					switch (answer) {

					case 1:
						sc.nextLine();
						System.out.println("Enter the phone number");
						phoneNum = sc.nextLine();
						p1.removeEntry(3, phoneNum);
						break;
					}
					break;
				case 5:
					System.out.println("Thank you, have a good day");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, please enter a number");
			} catch (Exception f) {
				System.out.println("Error here: " + f);
			}
		}

	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("********Scott's Phonebook********");
		System.out.println("Enter 1 to add new entry");
		System.out.println("Enter 2 to display all entries");
		System.out.println("Enter 3 to search for specific entry");
		System.out.println("Enter 4 to remove specific entry");
		System.out.println("Enter 5 to exit");
		System.out.println("Please enter a number: ");
		int choice = input.nextInt();
		System.out.println();
		return choice;

	}

}
