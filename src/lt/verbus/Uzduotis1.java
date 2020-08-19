package lt.verbus;

import java.util.Scanner;

public class Uzduotis1 {

	public static void main(String[] args) {

		String sakinys = ivesti();

		System.out.println("Pirmas sakinio žodis: " + sakinys.split(" ")[0] + ".");
	}

	private static String ivesti() {
		Scanner input = new Scanner(System.in);
		System.out.println("Įvesk sakinį iš kelių žodžių: ");
		return input.nextLine();
	}

}
