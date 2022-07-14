/**
 * Author:		Les Malan
 * Date:		07/13/22
 * File:		FighterJet.java
 * Description: Class description Fighter Jet
 */

public class FighterJet implements AirVehicle, SoundBarrier
{
	// Declare private data members
	private int numEngines;
	private int numCrewMembers;
	private String nameOfJet;
	private String manufacturer;
	
	// default constructor
	public FighterJet() {}
	
	// constructor with arguments
	public FighterJet(int numEngines, int numCrewMembers, String nameOfJet, String manufacturer)
	{
		this.numEngines = numEngines;
		this.numCrewMembers = numCrewMembers;
		this.nameOfJet = nameOfJet;
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
	public String getNameOfJet()
	{
		return nameOfJet;
	}
	// set name
	public void setName(String nameOfJet)
	{
		this.nameOfJet = nameOfJet;
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
		+ "#   FighterJet Info   #" + "\n"
		+ "FighterJet [numEngines=" + getNumEngines() + ", numCrewMembers=" + getCrewMembers() + 
		", nameOfJet=" + getNameOfJet() + ", manufacturer=" + getManufacturer() + "]" + "\n";
	}
	
	// implement methods from Air Vehicle
	public void avTakeoff()
	{
		System.out.println(getNameOfJet() + " is starting the takeoff roll." + "\n");
	}
	public void avFly()
	{
		System.out.println(getNameOfJet() + " has taken off and is now flying." + "\n");
	}
	public void avLand()
	{
		System.out.println(getNameOfJet() + " has successfully landed." + "\n");
	}
	
	// implement methods from Sound Barrier
	public void breakSoundBarrier()
	{
		System.out.println("BOOM!! " + getNameOfJet() + 
		" has broken the sound barrier! Eat your heart out, Chuck Yeager..." + "\n");
	}
}