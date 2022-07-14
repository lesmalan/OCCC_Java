/**
 * Author:		Les Malan
 * Date:		07/13/22
 * File:		CargoPlane.java
 * Description: Class description Cargo Plane
 */

public class CargoPlane implements AirVehicle
{
	// Declare private data members
	private int numEngines;
	private int numCrewMembers;
	private String nameOfPlane;
	private String manufacturer;
	
	// default constructor
	public CargoPlane() {}
	
	// constructor with arguments
	public CargoPlane(int numEngines, int numCrewMembers, String nameOfPlane, String manufacturer)
	{
		this.numEngines = numEngines;
		this.numCrewMembers = numCrewMembers;
		this.nameOfPlane = nameOfPlane;
		this.manufacturer = manufacturer;
	}
	
	// get engines
	public int getNumEngines()
	{
		return numEngines;
	}
	// set engines
	public void setNumEngines(int numEngines)
	{
		this.numEngines = numEngines;
	}
	
	// get crew members
	public int getCrewMembers()
	{
		return numCrewMembers;
	}
	// set crew members
	public void setCrewMembers(int numCrewMembers)
	{
		this.numCrewMembers = numCrewMembers;
	}
	
	// get name
	public String getNameOfPlane()
	{
		return nameOfPlane;
	}
	// set name
	public void setName(String nameOfPlane)
	{
		this.nameOfPlane = nameOfPlane;
	}

	// get manufacturer
	public String getManufacturer()
	{
		return manufacturer;
	}
	// set manufacturer
	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}
	
	// to string
	public String toString()
	{
		return "#######################" + "\n" 
		+ "#   CargoPlane Info   #" + "\n"
		+ "CargoPlane [numEngines=" + getNumEngines() + ", numCrewMembers=" + getCrewMembers() + 
		", nameOfPlane=" + getNameOfPlane() + ", manufacturer=" + getManufacturer() + "]" + "\n";
	}
	
	// implement methods from Air Vehicle
	public void avTakeoff()
	{
		System.out.println(getNameOfPlane() + " is starting the takeoff roll." + "\n");
	}
	
	public void avFly()
	{
		System.out.println(getNameOfPlane() + " has taken off and is now flying." + "\n");
	}
	public void avLand()
	{
		System.out.println(getNameOfPlane() + " has successfully landed." + "\n");
	}
}