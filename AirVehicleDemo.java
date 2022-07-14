/**
 * Author:		Les Malan
 * Date:		07/13/22
 * File:		AirVehicleDemo.java
 * Description: Runs AirVehicle
 */

public class AirVehicleDemo 
{
	public static void main(String[] args) 
	{
		// create fighter jet object with arguments
		FighterJet fighterJet01 = new FighterJet(2, 2, "F-14B Tomcat", "Grumman");
		
		// create cargo plane object with arguments
		CargoPlane cargoPlane01 = new CargoPlane(4, 5, "C-130H Hercules", "Lockheed Martin");
		
		// Display info and run methods
		System.out.print(fighterJet01.toString() + "\n");
		fighterJet01.avTakeoff();
		fighterJet01.avFly();
		fighterJet01.breakSoundBarrier();
		fighterJet01.avLand();
		
		System.out.print(cargoPlane01.toString() + "\n");
		cargoPlane01.avTakeoff();
		cargoPlane01.avFly();
		cargoPlane01.avLand();

	}
}
