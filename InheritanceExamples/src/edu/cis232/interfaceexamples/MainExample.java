package edu.cis232.interfaceexamples;

public class MainExample {

	public static void main(String[] args) {
		Weapon[] weapons = new Weapon[3];
		weapons[0] = new LaserCannon();
		weapons[1] = new Cannon(1);
		weapons[2] = new LightSpeedCannon();
		
		fireWeapon(weapons[1], "Other ship");
		fireWeapon(weapons[1], "Other ship");
		
		if(weapons[1] instanceof LoadableWeapon){
			LoadableWeapon w = (LoadableWeapon)weapons[1];
			w.load(5);
		}
		
		fireWeapon(weapons[1], "Other ship");
		
		System.out.println("Switching to lightspeed cannon!");
		fireWeapon(weapons[2], "Far away ship");
		
		System.out.println("Loading lightspeed cannon!");
		((LoadableWeapon)weapons[2]).load(3);
		
		System.out.println("Firing lightspeed cannon!");
		fireWeapon(weapons[2], "Far away ship");
		
	}
	
	public static void fireWeapon(Weapon w, String target){
		if(w.fire(target)){
			System.out.println("Fired weapon!");
		} else {
			System.out.println("Out of ammo!");
		}
	}

}
