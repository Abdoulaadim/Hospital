package com.hospital.Impl;

import com.hospital.models.Operation;
import com.hospital.models.Patient;

public class EfOperation implements com.hospital.interfaces.EfOperation{

	@Override
	public void affichage( String hName, String dName) {
		// TODO Auto-generated method stub
		
		System.out.println("Vous avez effectuer une operation ");
		System.out.println("Dans l'hopital " + hName );
		System.out.println("Avec le medecin :" + dName);
		System.out.println("veuillez saisir le montant de l'operation ");
		
	}

	

}
