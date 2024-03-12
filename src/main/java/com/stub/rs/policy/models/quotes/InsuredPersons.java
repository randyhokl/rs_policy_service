package com.stub.rs.policy.models.quotes;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class InsuredPersons {
	
	private String fullName;  
	private String email;
	private LocalDate dob;
	private String address; 
	private String nationality; 
	private String gender;
	private String postCode; 
	private String country;
	private Integer insuredType;
	private List<Contacts> contacts;


}
