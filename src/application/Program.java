package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.PhysicalPerson;
import entities.Taxpayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int numberPayers = sc.nextInt();
	
		List<Taxpayer> list = new ArrayList<>();

		for (int i = 1; i <= numberPayers; i++) {

			System.out.println("Tax payer #" + numberPayers + " data:");
			System.out.print("Individual or company (i/c)? ");
			char individual_or_company = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (individual_or_company == 'i') {

				System.out.print("Health expenditures: ");
				double healthExpenditure = sc.nextDouble();
				list.add(new PhysicalPerson(name, anualIncome, healthExpenditure));
			
			} else {

				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new LegalPerson(name, anualIncome, numberEmployees));
			
			}
		}

		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (Taxpayer taxPayer : list) {
			
			System.out.println(taxPayer.getName() + " $ " + String.format("%.2f", taxPayer.tax()));
			sum += taxPayer.tax();
			
		}
		
		System.out.println();
		System.out.printf("TAXES PAID: $ %.2f", sum);
		
		
		sc.close();

	}

}
