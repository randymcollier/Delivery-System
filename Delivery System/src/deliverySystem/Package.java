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

public class Package 
{
	protected Client sender = new Client();
	protected Client recipient = new Client();
	protected double weight;
	protected double costPerOnce;
	
	Package()
	{
		weight = 0;
		costPerOnce = 0;
		sender = null;
		recipient = null;
	}
	
	Package(double weight, double costPerOnce, Client a, Client b) 
	{
		this.weight = weight;
		this.costPerOnce = costPerOnce;
		sender = a;
		recipient = b;
	}
	
	public double calculateCost()
	{
		return weight * costPerOnce;
	}
	
	public String toString()
	{
		return ("\nSender: " + sender.toString() + " \nReceiver: " + recipient.toString() + "\nThe weight of the package is " + weight + " onces, the cost per once is $" + costPerOnce + 
				" , and the total cost is $" + calculateCost() + " .");
	}
}
