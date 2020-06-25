package com.addressbook.test;
import com.addressbook.model.Person;
public class AddressBook{
	public static void main(String[] args){
		Person newPerson=new Person();
		newPerson.setName("Arun");
		newPerson.setEmailId("arunnissy@gmail.com");
		newPerson.setMob_No("7353057484");
		newPerson.setcity("Bangalore");
		newPerson.setzipcode(560050);
		newPerson.setState("Karnataka");

		System.out.println("User name: "+newPerson.getName());
		System.out.println("User Email: "+newPerson.getEmailId());
		System.out.println("User Mobile Number: "+newPerson.getMob_No());
		System.out.println("User city: "+newPerson.getcity());
		System.out.println("User Zip code : "+newPerson.getzipcode());
		System.out.println("User State : "+newPerson.getState());




   	}
}
