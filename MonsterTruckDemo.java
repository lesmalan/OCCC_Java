/**
 * Author:		Les Malan
 * Date:		07/08/22
 * File:		MonsterTruckDemo.java
 * Description: Runs the MonsterTruck and Vehicle classes
 */

public class MonsterTruckDemo 
{
	public static void main(String[] args) 
	{
		// create first monster truck with default constructor
		MonsterTruck monsterTruck01 = new MonsterTruck();
		// user setters to populate values
		monsterTruck01.setName("Max D");
		monsterTruck01.setColor("silver");
		monsterTruck01.setPower("gasoline");
		monsterTruck01.setWins(10);
		monsterTruck01.setLosses(2);
		monsterTruck01.setSpecialTrick("backflip");
		
		// display first monster truck info
		System.out.println("############################");
		System.out.println("#   MONSTER TRUCK  INFO    #");
		System.out.println("############################");
		System.out.println("");
		// use getters to display info for first truck
		System.out.println("Name: " + monsterTruck01.getName());
		System.out.println("Color: " + monsterTruck01.getColor());
		System.out.println("Power: " + monsterTruck01.getPower());
		System.out.println("# Wins: " + monsterTruck01.getWins());
		System.out.println("# Losses: " + monsterTruck01.getLosses());
		System.out.println("Special Trick: " + monsterTruck01.getSpecialTrick());
		System.out.print("Win Percentage: " + monsterTruck01.calcWinPercentage() + "%");
		System.out.println("\n");
		
		//create second monster truck with argument constructor
		MonsterTruck monsterTruck02 = new MonsterTruck(20,10,"Big Air","Grave Digger","black","gasoline",2021);
		// display properties of second truck with toString call
		System.out.print(monsterTruck02.toString());
		System.out.println("\n");
		
		// test calling Vehicle toString
		//Vehicle testVehicle01 = new Vehicle("Big Foot", "Blue", "Diesel", 1985);
		//System.out.print(testVehicle01.toString());
		//System.out.println("\n");
	}
}