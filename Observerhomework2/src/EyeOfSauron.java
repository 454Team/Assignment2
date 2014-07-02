import java.util.Observable;


public class EyeOfSauron extends Observable {
	
	private GoodGuysHobbits goodGuysHobbits= new GoodGuysHobbits();
	private GoodGuysDwarves goodGuysDwarves= new GoodGuysDwarves();
	private GoodGuysElves goodGuysElves = new GoodGuysElves();
	private GoodGuysMen goodGuysMen = new GoodGuysMen();
	
	public EyeOfSauron(){
		
	}
	
	public void GoodGuysDetected(){
		setChanged();
		notifyObservers();
	}
	
	public void setEnemies(int numHobbits,int numElves,int numDwarves,int numMen){
		goodGuysHobbits.setNumber(numHobbits);
		goodGuysDwarves.setNumber(numDwarves);
		goodGuysElves.setNumber(numElves);
		goodGuysMen.setNumber(numMen);
		GoodGuysDetected();
	}
	
	public int getnumHobbits(){
		return goodGuysHobbits.getNumber();
	}
	
	public int getnumElves(){
		return goodGuysElves.getNumber();
	}
	
	public int getnumDwarves(){
		return goodGuysDwarves.getNumber();
	}
	
	public int getnumMen(){
		return goodGuysMen.getNumber();
	}
	
}
