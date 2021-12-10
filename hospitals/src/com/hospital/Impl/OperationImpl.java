package com.hospital.Impl;


import java.util.List;
import java.util.Optional;

import com.hospital.interfaces.OperationInterface;
import com.hospital.models.Operation;

public class OperationImpl implements OperationInterface{

	@Override
	public Operation getOperationByRef(long ref,List<Operation> operations) {
		
		for (Operation op : operations) {
			
			if(op.getRef() == ref) {
				
				return op;
			}
		}
		
		
		return null;
		
 
		


	}

	@Override
	public void addOperation(List<Operation> operations) {
		// TODO Auto-generated method stub
		
	}

 

	 

	 

	 

}
