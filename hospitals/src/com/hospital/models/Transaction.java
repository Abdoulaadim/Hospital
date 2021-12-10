package com.hospital.models;

import java.util.Date;

public class Transaction {
	
	private Patient patient ;
	private Date dateTransaction;
	private double montant;
	private Hospital hopitale;
	private Operation operation;
	
	
	public Transaction(Patient patient, Date dateTransaction, double montant, Hospital hopitale,Operation operation) {
		
		this.patient = patient;
		this.dateTransaction = dateTransaction;
		this.montant = montant;
		this.hopitale = hopitale;
		this.operation = operation;
	}

	public Patient getPatien() {
		return patient;
	}
	public void setPatien(Patient patient) {
		this.patient = patient;
	}
	public Date getDateTransaction() {
		return dateTransaction;
	}
	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Hospital getHopitale() {
		return hopitale;
	}
	public void setHopitale(Hospital hopitale) {
		this.hopitale = hopitale;
	}
 
	 

	@Override
	public String toString() {
		return "Transaction [patient=" + patient + ", dateTransaction=" + dateTransaction + ", montant=" + montant
				+ ", hopitale=" + hopitale + ", operation=" + operation + "]";
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}
 	

}
