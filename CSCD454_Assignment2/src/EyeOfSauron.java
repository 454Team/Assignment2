/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 2: Observer Pattern
 */

import java.util.Observable;

public class EyeOfSauron extends Observable {
	private int hobbits;
	private int elves;
	private int dwarves;
	private int men;
		
	public void setEnemies(int hobbits, int dwarves, int elves, int men) {
		this.setHobbits(hobbits);
		this.setDwarves(dwarves);
		this.setElves(elves);
		this.setMen(men);
		notifyEye();
	}// End setEnemies
	
	public void notifyEye() {
		setChanged();
		notifyObservers();
	}// End notifyEye

	public int getHobbits() {
		return hobbits;
	}// End getHobbits

	public void setHobbits(int hobbits) {
		this.hobbits = hobbits;
	}// End setHobbits

	public int getElves() {
		return elves;
	}// End getElves

	public void setElves(int elves) {
		this.elves = elves;
	}// End setElves

	public int getMen() {
		return men;
	}// End getMen

	public void setMen(int men) {
		this.men = men;
	}// End setMen

	public int getDwarves() {
		return dwarves;
	}// End getDwarves

	public void setDwarves(int dwarves) {
		this.dwarves = dwarves;
	}// End setDwarves

}// End class
