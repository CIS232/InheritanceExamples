package edu.cis232.interfaceexamples;

public class Cannon implements Weapon, LoadableWeapon {

	public int ammo = 0;
	
	public Cannon(){
		
	}
	
	public Cannon(int ammo){
		this.ammo = ammo;
	}
	
	@Override
	public boolean fire(String target) {
		boolean fired = false;
		if(ammo > 0){
			ammo--;
			fired = true;
		}
		return fired;
	}
	
	public void load(int ammo){
		this.ammo += ammo;
	}

}
