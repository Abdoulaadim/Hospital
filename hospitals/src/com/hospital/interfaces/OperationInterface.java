package com.hospital.interfaces;

import com.hospital.models.Doctor;
import com.hospital.models.Hospital;
import com.hospital.models.Operation;
import com.hospital.models.Patient;
import com.hospital.models.Room;

import java.util.Optional;
import java.util.List;


public interface OperationInterface {

	public Operation getOperationByRef(long ref,List<Operation> operations);
	
	public void addOperation(List<Operation> operations);

}
