package finalphonebook;

import java.util.Arrays;

public class Phonebook {
	static int recordNum = 0;

	static Person[] directory = new Person[0];

	public void addPerson(Person newPerson) {

		Person[] temp = new Person[directory.length + 1];

		for (int i = 0; i < directory.length; i++) {
			temp[i] = directory[i];
		}
		temp[temp.length - 1] = newPerson;
		directory = temp;

	}

	{

	}

	public static void searchForPerson(int methodOfSearch, String searchTerm) {
		switch (methodOfSearch) {
		case 1:
			for (int i = 0; i < directory.length; i++) {
				try {
					if (directory[i].getFirstName().equalsIgnoreCase(searchTerm)) {
						directory[i].printPerson();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			break;

		case 2:
			for (int i = 0; i < directory.length; i++) {
				if (directory[i].getLastName().equalsIgnoreCase(searchTerm)) {
					directory[i].printPerson();

				}
			}
			break;
		case 3:
			for (int i = 0; i < directory.length; i++) {
				if (directory[i].getPhoneNum().equals(searchTerm)) {
					directory[i].printPerson();
				}

				break;
			}
		case 4:
			for (int i = 0; i < directory.length; i++) {
				if (directory[i].getCity().equalsIgnoreCase(searchTerm)) {
					directory[i].printPerson();
				}

				break;
			}
		case 5:
			for (int i = 0; i < directory.length; i++) {
				if (directory[i].getState().equalsIgnoreCase(searchTerm)) {
					directory[i].printPerson();
				}

				break;
			}
		case 6:
			boolean firstMatches = false, lastMatches = false, middleMatches = false;
			String firstName = searchTerm.substring(0, searchTerm.indexOf(" "));
			searchTerm = searchTerm.replaceFirst(firstName + " ", "");
			String lastName = searchTerm.substring(0, searchTerm.indexOf(" "));
			String middleName = searchTerm.replaceFirst(lastName + " ", "");

			for (int i = 0; i < directory.length; i++) {
				if (directory[i].getFirstName().equalsIgnoreCase(firstName)) {
					firstMatches = true;

				}
				if (directory[i].getLastName().equalsIgnoreCase(lastName)) {
					lastMatches = true;

				}
				if (directory[i].getMiddleName().equalsIgnoreCase(middleName)) {
					middleMatches = true;

				}
				if (firstMatches && lastMatches && middleMatches) {

					directory[i].printPerson();

				}
				firstMatches = false;
				lastMatches = false;
				middleMatches = false;

			}
		}
	}

	public void printDirectory() {
		System.out.println("Entries: ");
		String list = "";

		try {
			for (int i = 0; i < directory.length; i++) {
				list += directory[i].getFirstName() + directory[i].getLastName() + ", ";
				if (null != directory[i]) {
					directory[i].printPerson();

				}

			}
		} catch (NullPointerException e) {
			System.out.println("Null value found");

		}
	}

	public void printAlphabetArray() {

		System.out.println("Entries by alphabet: ");
		String[] alphabet = new String[directory.length];
		for (int i = 0; i < directory.length; i++) {

			alphabet[i] = directory[i].getFirstName() + " " + directory[i].getLastName() + " "
					+ directory[i].getMiddleName();
		}
		Arrays.sort(alphabet);
		for (int i = 0; i < alphabet.length; i++) {

			searchForPerson(6, alphabet[i]);
		}
	}

	public void removeEntry(int methodOfSearch, String removal) {

		Person[] temp = new Person[directory.length - 1];
		int j = 0;

		for (int i = 0; i < directory.length; i++) {
			if (!directory[i].getPhoneNum().equalsIgnoreCase(removal)) {
				temp[j] = directory[i];
				j++;

			}

		}

		directory = temp;
	}
}
