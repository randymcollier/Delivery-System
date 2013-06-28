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

public class PackageDriver 
{
	public static void main(String[] args) 
	{
		Client client1 = new Client("Randy Collier","5999 Noah Curtis St.","Shannon","MS","38868");
		Client client2 = new Client();
		client2.setName("Katie Stone");
		client2.setAddress("1331 Oxford Way");
		client2.setCity("Oxford");
		client2.setState("MS");
		client2.setZip("38655");
		Client client3 = new Client("Bart Ryan", "123 ABC St.", "Oxford", "MS", "38655");
		Client client4 = new Client("Adam Guntharp", "111 North St.", "Tupelo", "MS", "38801");
		Package b = new OvernightPackage(5, 1, 2.5, client2, client4);
		Package c = new TwoDayPackage(2, 1, .5, client1, client2);
		Package d = new Package(2, 1, client1, client3);
		Package e = new OvernightPackage(2, 1, 1.5, client1, client2);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
