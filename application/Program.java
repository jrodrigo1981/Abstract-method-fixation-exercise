package com.rodrigo.aula134.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.rodrigo.aula134.entities.TaxPayer;
import com.rodrigo.aula134.entities.Individual;
import com.rodrigo.aula134.entities.Company;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int payers = sc.nextInt();
		
		for(int i=0; i<payers; i++) {
			System.out.println("Tax payer #"+ (i + 1) +  " data:");
			
			System.out.print("Individual or company (i/c)? ");
			char choice = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();
			
			if(choice == 'i') {
				System.out.print("Health expenditures: ");
				Double health = sc.nextDouble();
				
				list.add(new Individual(name, income, health));
				
			} else {
				System.out.print("Number of employees: ");
				Integer employee = sc.nextInt();
				
				list.add(new Company(name, income, employee));				
			}
			
		}
		System.out.println();
		System.out.println("TAXED PAID");
		for(TaxPayer people : list) {
			System.out.println(people);
		}
		System.out.println();
		Double sum = 0.0;
		for(TaxPayer people : list) {
			sum += people.tax();
			
		}
		;
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();
	}

}
