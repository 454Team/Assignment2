
public class BattleTime {
	public static void main(String[] args){
		EyeOfSauron eye = new EyeOfSauron();
        BadGuysInterface saruman = new BadGuysSaruman(eye, "Saruman");
        BadGuysInterface angmar = new BadGuysAngmar(eye, "Angmar");
        BadGuysInterface leader = new BadGuysLeader(eye, "Leader");
        eye.setEnemies(1, 1, 2, 0); //hobbits, elves, dwarves, men
        //message should be displayed from Saruman and Angmar that they know about 1 hobbit, 1 elf, 2 dwarves
        
        saruman.defeated(); //Saruman is no longer registered with the Eye
        eye.setEnemies(4, 2, 2, 100);
        //only Angmar reports on the enemies
	}
}
