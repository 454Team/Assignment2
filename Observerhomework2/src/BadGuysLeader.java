import java.util.Observable;
import java.util.Observer;


public class BadGuysLeader implements BadGuysInterface, Observer, Display {

	private Observable observable;
	private String name;
	private int numHobbits;
	private int numElves;
	private int numDwarves;
	private int numMen;
	
	public BadGuysLeader(Observable observable,String name){
		this.observable = observable;
		this.name = name;
		
		// register observer to Eyeof Sauron
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof EyeOfSauron){
			EyeOfSauron eyeOfSauron = (EyeOfSauron) o;
			this.numHobbits = eyeOfSauron.getnumHobbits();
			this.numElves = eyeOfSauron.getnumElves();
			this.numDwarves = eyeOfSauron.getnumDwarves();
			this.numMen = eyeOfSauron.getnumMen();
			display();
		}
	}

	@Override
	public String toString(){
		return this.name + " has noticed good guys ~~~~ " + 
				this.numHobbits 	+ 	" Hobbits "  	+ 
				this.numElves 		+ 	" Elves "  		+
				this.numDwarves 	+ 	" Dwarves "  	+
				this.numMen 		+ 	" Men "  		+
				" \n";
	}

	@Override
	public void defeated() {
		observable.deleteObserver(this);
	}

	@Override
	public void display() {
		System.out.println(this.toString());
		
	}


}
