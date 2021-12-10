package com.hospital.models;

import com.hospital.enumerations.InsuranceType;

public class Operation {
	
	private long ref;
	private Patient patient;
	private Hospital hopital;

	private Room room;

	private Doctor doctor;

	private double reductionTarif;
	private boolean reductionRAMED;

	public boolean isReductionRAMED() {
		return reductionRAMED;
	}

	public void setReductionRAMED(boolean reductionRAMED) {
		this.reductionRAMED = reductionRAMED;
	}

	public Operation(Patient patient, Hospital hopital, Room room, Doctor doctor) {
		super();
		this.ref = 1L + (long) (Math.random() * (10L - 1L));
		this.hopital = hopital;
		this.room = room;
		setDoctor(doctor);
	}

	public Operation() {
		super();
	}

	public Hospital getHopital() {
		return hopital;
	}

	public long getRef() {
		return ref;
	}

//	public void setRef(long ref) {
//		this.ref = ref;
//	}

	public void setHopital(Hospital hopital) {
		this.hopital = hopital;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		if (this.hopital.getDoctors().contains(doctor)) {
			this.doctor = doctor;
		}

	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		if (InsuranceType.CNOPS == patient.getInsuranceType() || InsuranceType.CNSS == patient.getInsuranceType()
				|| InsuranceType.RAMED == patient.getInsuranceType()) {
			this.patient = patient;
			if (InsuranceType.CNOPS == patient.getInsuranceType()) {
				this.reductionTarif = 1;

			} else if (InsuranceType.CNSS == patient.getInsuranceType()) {
				this.reductionTarif = 0.7;

			} else if (InsuranceType.RAMED == patient.getInsuranceType()) {
				this.reductionRAMED = true;
				this.reductionTarif = 0.8;
			}

		}

		this.patient = patient;
	}

	public double getReductionTarif() {
		return reductionTarif;
	}

	public void setReductionTarif(double reductionTarif) {
		this.reductionTarif = reductionTarif;
	}

	// Une opération sera dans un hopital, dans une salle spécifique, et géré par un
	// médecin X qui fait partie de l'hopital :)

	// Il faut vérifier l'assurance du patient avant de passer l'opération si elle
	// est cnops , cnss ou ramid

	// Ajouter une classe infirmière pour aider le médecin dans son travail

	// l'assurance rembourse un pourcentage de 70% si c'est CNSS et 80% pour RAMED
	// et 100% pour CNOPS

	// chaque opération a un prix, le patient doit payer le montant et après
	// l'hopital va lui remboursser (le cas du CNSS et CNOPS) , si RAMED le patient
	// va juste
	// payer la différence dès le début (20%)

	// Proposition : Ajouter un attribut portefeuille à la classe Patient pour gérer
	// le solde du patient, et du coup il faut avoir aussi une classe transaction
	// qui traçe les
	// actions de payments avec la date...

	// Essayer de structurer votre travail avec la création des interfaces qui vous
	// permettez d'implémenter les méthodes nécessaires.

	// Après le payement d'une opération et si c'est passé avec succès le programme
	// est terminé, sinon il faut renvoyer le montant vers la portefeuille patient
	// et dans ce cas son dossier est en stand by pour le discuter au tribunal.
	// (vous devez gérer les status de chaque opération)
}