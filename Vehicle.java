/**
 * Author:		Les Malan
 * Date:		07/08/22
 * File:		Vehicle.java
 * Description: Vehicle class
 */

public class Vehicle 
{
	// private data members
	private String name;
	private String color;
	private String power;
	private int year;
	
	// default constructor
	public Vehicle() {}
	
	//constructor with arguments
	public Vehicle (String name, String color, String power, int year) 
	{
		this.name = name;
		this.color = color;
		this.power = power;
		this.year = year;
	}
	// name getter
	public String getName()
	{
		return name;
	}
	// name setter
	public void setName(String name)
	{
		this.name = name;
	}
	// color getter
	public String getColor()
	{
		return color;
	}
	// color setter
	public void setColor(String color)
	{
		this.color = color;
	}
	// power getter
	public String getPower()
	{
		return power;
	}
	// power setter
	public void setPower(String power)
	{
		this.power = power;
	}
	// year getter
	public int getYear()
	{
		return year;
	}
	// year setter
	public void setYear(int year)
	{
		this.year = year;
	}
	// returns all info in string
	public String toString()
	{
		return 
		"###########################" + "\n" +
		"#      VEHICLE INFO       #" + "\n" +
		"###########################" + "\n" +
		"\n" +
		"Name: " + getName() + "\n" +
		"Color: " + getColor() + "\n" +
		"Power: " + getPower() + "\n" +
		"Year: " + getYear();
	}
}