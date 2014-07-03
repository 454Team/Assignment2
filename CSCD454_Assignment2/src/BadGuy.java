/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 2: Observer Pattern
 */

import java.util.Observable;
import java.util.Observer;

public class BadGuy implements Observer {
	private String badGuy;
	private EyeOfSauron eye;
	private int hobbits;
	private int elves;
	private int dwarves;
	private int men;
	
	public BadGuy(EyeOfSauron eye, String badGuy) {
		this.setBadGuy(badGuy);
		this.setEye(eye);
		eye.addObserver(this);
	}// End BadGuy

	public void defeated() {
		eye.deleteObserver(this);
	}// End defeated

	public String getBadGuy() {
		return badGuy;
	}// End getBadGuy

	public void setBadGuy(String badGuy) {
		this.badGuy = badGuy;
	}// End setBadGuy

	public EyeOfSauron getEye() {
		return eye;
	}// End getEye

	public void setEye(EyeOfSauron eye) {
		this.eye = eye;
	}// End setEye

	public void update(Observable occurence, Object arg) {
		if(occurence instanceof EyeOfSauron) {
			this.eye = (EyeOfSauron)eye;		
			this.hobbits = eye.getHobbits();
			this.elves = eye.getElves();
			this.dwarves = eye.getDwarves();
			this.men = eye.getMen();
			display();
		}
	}// End update

	public void display() {
		System.out.println(this.badGuy + " sees:\n" 
				+ this.hobbits + " hobbits\n"
				+ this.elves + " elves\n" 
				+ this.dwarves + " dwarves\n"
				+ this.men + " men");
	}// End display

	
}// End class
