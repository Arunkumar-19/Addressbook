package com.addressbook.model;
public class Person{
	String Name;
	String EmailId;
	String Mob_No;
	String city;
	int zipcode;
	String State;

	public String getEmailId(){
	return this.EmailId;
	}

	public String getName(){
	return this.Name;
	}

	public String getMob_No(){
	return this.Mob_No;
	}

	public String getcity(){
	return this.city;
	}

	public int getzipcode(){
	return this.zipcode;
	}

	public String getState(){
	return this.State;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public void setEmailId(String EmailId){
		this.EmailId=EmailId;
	}
	public void setMob_No(String Mob_No){
		this.Mob_No=Mob_No;
	}
	public void setcity(String city){
		this.city=city;
	}
	public void setzipcode(int zipcode){
		this.zipcode=zipcode;
	}
	public void setState(String State){
		this.State=State;
    }
}
