package com.hospital.Impl;

import java.util.Date;
import java.util.Scanner;

import com.hospital.enumerations.InsuranceType;
import com.hospital.interfaces.PatientInterface;
import com.hospital.models.Patient;

public class PatientImpl implements PatientInterface {
	
	Scanner sc = new Scanner(System.in);
	Patient patient;
	Date date = new Date();
	
	@Override
	public Patient infopatient() {
		
		
		System.out.println("Entrer  le nom de patient  :");
		String nom = sc.next();

		System.out.println("Entrer le  prénom de patient :");
		String prenom = sc.next();

		System.out.println("Entrer votre le telephone  de patient  :");
		String phone = sc.next();

		System.out.println("Entrer le  l'adresse de patient :");
		String adress = sc.next();

		System.out.println("Entrer  un numero pour le patient   :");
		String affiliationNumber = sc.next();

		System.out.println("Entrer  l'assurence  pour le patient CNOPS / CNSS / RAMED / NON  :");
		String insuranceType = sc.next();
		InsuranceType insurance = InsuranceType.valueOf(insuranceType);
		if (insurance == InsuranceType.CNOPS || insurance == InsuranceType.CNSS
				|| insurance == InsuranceType.RAMED) {
			patient = new Patient(nom, prenom, phone, adress, date, affiliationNumber, insurance);
			System.out.println(patient);
			return patient;
		} else {
			System.out.println("Erreur de saisie ");
			return null;
		}
	}

}
