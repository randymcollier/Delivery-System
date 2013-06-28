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

public class OvernightPackage extends Package
{
	protected double overnightCost;
	
	OvernightPackage()
	{
		overnightCost = 0;
	}
	
	OvernightPackage(double onces, double cost, double charge, Client a, Client b)
	{
		weight = onces;
		costPerOnce = cost;
		overnightCost = charge;
		sender = a;
		recipient = b;
	}
	
	public double calculateCost()
	{
		return super.calculateCost() + overnightCost;
	}
	
	public String toString()
	{
		return super.toString() + "\nThere was an overnight delivery service charge of $" + overnightCost
				+ " added to the total cost.\n\n";
	}
}
