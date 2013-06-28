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

public class TwoDayPackage extends Package
{
	protected double twoDayCharge;
	
	TwoDayPackage()
	{
		twoDayCharge = 0;
	}
	
	TwoDayPackage(double onces, double cost, double charge, Client b, Client c)
	{
		weight = onces;
		costPerOnce = cost;
		twoDayCharge = charge;
		sender = b;
		recipient = c;
	}
	
	public double calculateCost()
	{
		return super.calculateCost() + twoDayCharge;
	}
	
	public String toString()
	{
		return super.toString() + "\nThere was a two-day-delivery service charge of $" + twoDayCharge
				+ " added to the total cost.\n\n";
	}
}
