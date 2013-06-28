package deliverySystem;
/****************************************************
* COURSE INFORMATION: CSCI 112, Fall 2011
* NAME: [Randy Collier]
* EMAIL: [rcollier@olemiss.edu]
* HOMEWORK INDEX: [#2]
* PROGRAM TITLE/TOPIC: [Package Delivery Service]
* REFERENCES:
* Include parts of the textbook, web sites, tutor, books, etc
* that you consulted.
*
* HONOR CODE STATEMENT:
* In keeping with the Honor Code policies of the University of
* Mississippi, the School of Engineering, and the Department of
* Computer and Information Science, I affirm that I have neither
* given nor received assistance on this programming exercise.
*
* DATE: [2011-09-21]
* PROGRAM DESCRIPTION:
* [This program develops and implements delivery options for delivery services.]
****************************************************/

public class Client
{
	protected String name, address, city, state, zip;
	
	Client ()
	{
		name = null;
		address = null;
		city = null;
		state = null;
		zip = null;
	}
	
	Client (String name, String address, String city, String state, String zip)
	{
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public String toString()
	{
		return ("The client's name is " + name + ", and his/her address is " + address +
				", " + city + ", " + state + " " + zip + ".");
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setAddress (String address) {
		this.address = address;
	}
	
	public void setCity (String city) {
		this.city = city;
	}
	
	public void setState (String state) {
		this.state = state;
	}
	
	public void setZip (String zip) {
		this.zip = zip;
	}
}
