/**
 * Author:		Les Malan
 * Date:		07/08/22
 * File:		MonsterTruck.java
 * Description: Monster Truck SubClass
 */

public class MonsterTruck extends Vehicle
{
	// private data members
	private int wins;
	private int losses;
	private String specialTrick;
	
	// default constructor
	public MonsterTruck() {}
	
	// constructor with arguments
	public MonsterTruck(int wins, int losses, String specialTrick, String name, String color, String power, int year)
	{
		this.wins = wins;
		this.losses = losses;
		this.specialTrick = specialTrick;
		setName(name);
		setColor(color);
		setPower(power);
		setYear(year);
	}
	
	// get wins
	public int getWins()
	{
		return wins;
	}
	// set wins
	public void setWins(int wins)
	{
		this.wins = wins;
	}
	// get losses
	public int getLosses()
	{
		return losses;
	}
	// set losses
	public void setLosses(int losses)
	{
		this.losses = losses;
	}
	// get special trick
	public String getSpecialTrick()
	{
		return specialTrick;
	}
	// set special trick
	public void setSpecialTrick(String specialTrick)
	{
		this.specialTrick = specialTrick;
	}
	// calculate win percentage
	public double calcWinPercentage()
	{
		double winPercentage = 100 * (double)wins/((double)wins + (double)losses);
		double rndWinPercentage = Math.round(winPercentage*100.0)/100.0;
		return rndWinPercentage;
	}
	// returns all info in string
	public String toString()
	{
		return 
		"###########################" + "\n" +
		"#   MONSTER TRUCK INFO    #" + "\n" +
		"###########################" + "\n" +
		"\n" +
		"Name: " + getName() + "\n" +
		"Color: " + getColor() + "\n" +
		"Power: " + getPower() + "\n" +
		"Year: " + getYear() + "\n" +
		"# Wins: " + getWins() + "\n" +
		"# Losses: " + getLosses() + "\n" +
		"Special Trick: " + getSpecialTrick() + "\n" +
		"Win Percentage: " + calcWinPercentage() + "%";
	}
}