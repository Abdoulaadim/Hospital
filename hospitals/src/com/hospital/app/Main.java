package com.hospital.app;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.hospital.Impl.EfOperation;
import com.hospital.Impl.PatientImpl;
import com.hospital.enumerations.InsuranceType;
import com.hospital.models.Doctor;
import com.hospital.models.Hospital;
import com.hospital.models.Infermiere;
import com.hospital.models.Operation;
import com.hospital.models.Patient;
import com.hospital.models.Person;
import com.hospital.models.Room;
import com.hospital.models.TimeSlot;
import com.hospital.models.Transaction;

public class Main {

	static TimeSlot shift = new TimeSlot(9, 18);
	public static List<Doctor> ListeDoctor = loadData_docteur();
	public static List<Infermiere> Listeinfermier = loadData_infermier();
	public static List<Room> listeroom = loadData_Room();
	public static List<Hospital> listehopital = loadData_Hospital();
	public static List<Operation> listoperation = new ArrayList<>();
	public static List<Patient> listpatient= new ArrayList<>();

	public static List<Doctor> loadData_docteur() {
		Doctor docteur1 = new Doctor("Ahmed", "Zerouali", "0438393983", "RUE N °4 V.N", "A43232", shift, 140000);
		Doctor docteur2 = new Doctor("Brahim", "Mohamadi", "032233233", "CAsablanca", "A3222", shift, 1388380);
		Doctor docteur3 = new Doctor("Rania", "Saadani", "032323288328", "ZARAds", "A2112", shift, 192828);
		Doctor docteur4 = new Doctor("Achraf", "Hrimza", "03223283238", "SAFI", "A3223", shift, 1938382);
		Doctor docteur5 = new Doctor("Ahmad", "Bnabd", "023832832", "Tanger", "A32112", shift, 202920);
		Doctor docteur6 = new Doctor("ibrahi", "sadan", "032832238", "SAFI", "A211232", shift, 922992);
		Doctor docteur7 = new Doctor("ghita", "kabira", "03283283238", "New york", "A21221", shift, 190000000);
		Doctor docteur8 = new Doctor("kabira", "elbardi", "0328238238", "AMESTERDAM", "A122", shift, 190000000);
		Doctor docteur9 = new Doctor("morad", "benmohdani", "032923832838", "AGADIR", "A23232", shift, 13823);
		Doctor docteur10 = new Doctor("ayoub", "aounati", "0323282383383", "TANGER", "A33223", shift, 140000);

		List<Doctor> ListeDoctor = new ArrayList<Doctor>();
		ListeDoctor.add(docteur1);
		ListeDoctor.add(docteur2);
		ListeDoctor.add(docteur3);
		ListeDoctor.add(docteur4);
		ListeDoctor.add(docteur5);
		ListeDoctor.add(docteur6);
		ListeDoctor.add(docteur7);
		ListeDoctor.add(docteur8);
		ListeDoctor.add(docteur9);
		ListeDoctor.add(docteur10);
		return ListeDoctor;
	}

	private static List<Hospital> loadData_Hospital() {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Infermiere> loadData_infermier() {
		Infermiere infermier1 = new Infermiere("Imane", "Bakhti", "03932839", "RUE N °4 V.N", "Z121", shift, 140000);
		Infermiere infermier2 = new Infermiere("Karima", "Mahrabi", "0328328", "CAsablanca", "ZA221", shift, 1388380);
		Infermiere infermier3 = new Infermiere("meryem", "hanoune", "0328238", "ZARAds", "ZAS12", shift, 192828);
		Infermiere infermier4 = new Infermiere("romario", "kershof", "0292118", "SAFI", "ZQ212", shift, 1938382);
		Infermiere infermier5 = new Infermiere("stati", "abdelaaziz", "032832", "Tanger", "ZF323223", shift, 202920);
		Infermiere infermier6 = new Infermiere("zidane", "zidane", "023823832", "SAFI", "ZSDDS22", shift, 922992);
		Infermiere infermier7 = new Infermiere("ahmed", "mahmoudi", "0328328238", "New york", "Z2AQ1221", shift,
				190000000);
		Infermiere infermier8 = new Infermiere("aymen", "chraydi", "03282388", "AMESTERDAM", "ZWWX2121", shift,
				190000000);
		Infermiere infermier9 = new Infermiere("kaltoum", "halim", "0328322838", "AGADIR", "ZWXW21", shift, 13823);
		Infermiere infermier10 = new Infermiere("anasse", "asbahi", "0328328328", "TANGER", "ZXWX21", shift, 140000);

		List<Infermiere> Listeinfermier = new ArrayList<Infermiere>();
		Listeinfermier.add(infermier1);
		Listeinfermier.add(infermier2);
		Listeinfermier.add(infermier3);
		Listeinfermier.add(infermier4);
		Listeinfermier.add(infermier5);
		Listeinfermier.add(infermier6);
		Listeinfermier.add(infermier7);
		Listeinfermier.add(infermier8);
		Listeinfermier.add(infermier9);
		Listeinfermier.add(infermier10);

		return Listeinfermier;
	}

	public static List<Room> loadData_Room() {
		Room room1 = new Room(1, 1);
		Room room2 = new Room(2, 1);
		Room room3 = new Room(3, 1);
		Room room4 = new Room(4, 1);
		Room room5 = new Room(5, 1);
		Room room6 = new Room(6, 1);
		Room room7 = new Room(1, 2);
		Room room8 = new Room(2, 2);
		Room room9 = new Room(3, 2);
		Room room10 = new Room(4, 2);
		Room room11 = new Room(5, 2);
		Room room12 = new Room(6, 2);
		Room room13 = new Room(1, 3);
		Room room14 = new Room(2, 3);
		Room room15 = new Room(3, 3);
		Room room16 = new Room(4, 3);
		Room room17 = new Room(5, 3);
		Room room18 = new Room(6, 3);

		List<Room> listeroom = new ArrayList<Room>();

		listeroom.add(room1);
		listeroom.add(room2);
		listeroom.add(room3);
		listeroom.add(room4);
		listeroom.add(room5);
		listeroom.add(room6);
		listeroom.add(room7);
		listeroom.add(room8);
		listeroom.add(room9);
		listeroom.add(room10);
		listeroom.add(room11);
		listeroom.add(room12);
		listeroom.add(room13);
		listeroom.add(room14);
		listeroom.add(room15);
		listeroom.add(room16);
		listeroom.add(room17);
		listeroom.add(room18);

		return listeroom;

	}

	public static List<Hospital> listehopital() {
		Hospital hospital1 = new Hospital("Moamed6", "Safi", ListeDoctor, listeroom);
		Hospital hospital2 = new Hospital("bentofaile", "Marrackech", ListeDoctor, listeroom);
		Hospital hospital3 = new Hospital("chaeikzaid", "casablanca", ListeDoctor, listeroom);
		Hospital hospital4 = new Hospital("sahara", "Marrackech", ListeDoctor, listeroom);
		Hospital hospital5 = new Hospital("Mohamed5", "Rebat", ListeDoctor, listeroom);

		List<Hospital> listehopital = new ArrayList<Hospital>();
		listehopital.add(hospital1);
		listehopital.add(hospital2);
		listehopital.add(hospital3);
		listehopital.add(hospital4);
		listehopital.add(hospital5);

		return listehopital;

	}

	public static void menu() {

		System.out.println(" ------------Menu------------ ");
		System.out.println("1)-Afficher la liste des hopitaux ");
		System.out.println("2)-Afficher la liste des docteurs ");
		System.out.println("3)-Afficher la liste de room");
		System.out.println("4)-Prendre un rendez vous");
		System.out.println("5)-Faire une operation");
		System.out.println("6)-Payer l'operation ");
		System.out.println("7)-Recuperer les frais d'operation via l'assurance  ");
		System.out.println("0)-Quitter");

		List<Hospital> listehopital = listehopital();

		int choix = 0;
		// Person persone = null;
		Patient patient = null;
		Operation operation = null;
		Transaction t = null;
		Date date = new Date();
		Scanner sc = new Scanner(System.in);
		choix = sc.nextInt();

		do {
			switch (choix) {
			case 1:
				for (int i = 0; i < listehopital.size(); i++) {
					System.out.println(listehopital.get(i).getName());
				}

				break;
			case 2:
				for (int i = 0; i < ListeDoctor.size(); i++) {
					System.out.println(ListeDoctor.get(i).getFirstname() + " \t " + ListeDoctor.get(i).getLastname()
							+ " \t" + ListeDoctor.get(i).getPhone() + " \t " + ListeDoctor.get(i).getAddress());
				}

				break;

			case 3:
				for (int i = 0; i < listeroom.size(); i++) {
					System.out.println(listeroom.get(i));
				}

				break;
			case 4:
//				System.out.println("Entrer  le nom de patient  :");
//				String nom = sc.next();
//
//				System.out.println("Entrer le  prénom de patient :");
//				String prenom = sc.next();
//
//				System.out.println("Entrer votre le telephone  de patient  :");
//				String phone = sc.next();
//
//				System.out.println("Entrer le  l'adresse de patient :");
//				String adress = sc.next();
//
//				System.out.println("Entrer  un numero pour le patient   :");
//				String affiliationNumber = sc.next();
				
				
//
//				System.out.println("Entrer  l'assurence  pour le patient CNOPS / CNSS / RAMED / NON  :");
//				String insuranceType = sc.next();
//				InsuranceType insurance = InsuranceType.valueOf(insuranceType);
				
				
				PatientImpl ptientimpl = new PatientImpl();
				
				listpatient.add(ptientimpl.infopatient());

			
				break;

			// persone = new Person(nom, prenom,phone,adress);
			case 5:
				if (listpatient.size() > 0) {
					// On Va prendre les valeurs des champs par defaut pour ne pas perdre beaucoup
					// de temps en saisie
					listoperation.add(new Operation(listpatient.get(0), listehopital.get(0), new Room(1, 1), ListeDoctor.get(0)));
					System.out.println("vous etes inscrit pour faire une operation corretement");
					// allimentation du portefeuille du patient avec un montant de 25k DHs
					listpatient.get(0).setPortfeuille(25000);
				} else {
					System.out.println("vous devrier prendre un rendez vous au debut");
				}
				break;
			case 6:
				if (listpatient.size() > 0  && listehopital.size() > 0) {
//					System.out.println("Vous avez effectuer une operation ");
//					System.out.println("Dans l'hopital " + listehopital.get(0).getName());
//					System.out.println("Avec le medecin :" + ListeDoctor.get(0).getFirstname() + " "
//							+ ListeDoctor.get(0).getLastname());
//					System.out.println("veuillez saisir le montant de l'operation ");
					
					 new EfOperation().affichage(listehopital.get(0).getName(), ListeDoctor.get(0).getFirstname() + " "+ ListeDoctor.get(0).getLastname());;
					
					double montant = sc.nextDouble();
					Date dateOperation = new Date();

					if (listoperation.get(0).isReductionRAMED()) { // si on a une assurance ramed le patient paie 20% des le depart
						montant = montant - (montant * listoperation.get(0).getReductionTarif());
					}
					if (montant < listpatient.get(0).getPortfeuille()) {

						t = new Transaction(listpatient.get(0), dateOperation, montant, listehopital.get(0), listoperation.get(0));
						// on retire de l'argent du portfeuille du patient
						listpatient.get(0).setPortfeuille(listpatient.get(0).getPortfeuille() - montant);
						System.out.println("update portfeuille : " + listpatient.get(0).getPortfeuille() + " DHS");

					} else {
						System.out.println("Vous n'avez pas d'assez d'argent pour effectuer l'operation ");
					}
				}
				else
				{
					System.out.println("vous n'avez pas encore fait votre operation");
				}

				break;

			case 7:

				if (t != null) {
					System.out.println("Vous avez payer " + t.getMontant());

					System.out.println("Vous avez l'assurance : " + listpatient.get(0).getInsuranceType().getValue());
					double montantRetour = 0;
					if (t.getOperation().getReductionTarif() == 1) {
						System.out
								.println("ce type d'assurance vous permettra de recevoir 100% de votre argent initial");
						montantRetour = t.getMontant();

					} else if (t.getOperation().getReductionTarif() == 0.8) {
						// on fait une reduction mais selon le montant payer par le patient avec la
						// redution du depart donc avec le montant de la transaction
						System.out
								.println("ce type d'assurance vous permettra de recevoir 80% de votre argent initial");

						montantRetour = t.getMontant() - (t.getMontant() * listoperation.get(0).getReductionTarif());

					} else if (t.getOperation().getReductionTarif() == 0.7 && t.getOperation().isReductionRAMED()) {
						System.out
								.println("ce type d'assurance vous permettra de recevoir 70% de votre argent initial");

						montantRetour = t.getMontant() - (t.getMontant() * listoperation.get(0).getReductionTarif());
					}

					listpatient.get(0).setPortfeuille(montantRetour);
					System.out.println("update Portfeuille : " + listpatient.get(0).getPortfeuille());
				} else {
					System.out.println("vous n'avez pas effectuer de transaction encore");
				}

			}
			System.out.println("Entrer votre choix ");
			choix = sc.nextInt();

		} while (choix != 0);
		System.out.println("Goodbye");
	}

	public static void main(String args[]) {
		// List<Hospital> listehopital = listehopital();
		// TimeSlot shift = new TimeSlot(9,18);
		// Infermiere f1 = new
		// Infermiere("Hamid","Rachidi","0614752523","Casablanca","MAT1452",shift,14000);
		// System.out.println(f1);

		// for (int i = 0; i < Listeinfermier.size(); i++) {
		// System.out.println(Listeinfermier.get(i));
		// }

		// System.out.println(listehopital.get(0).getDoctors().get(0));

		menu();
		
		
		//Hospital hospital = new  Hospital();

		//hospital.setName("Mohamed6");
		
		
		//System.out.println(hospital.getId());

	}

}
