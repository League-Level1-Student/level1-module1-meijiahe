import javax.swing.JOptionPane;

public class popcornMakerclass {
public static void main(String[] args) {
		
	 String answer=JOptionPane.showInputDialog(null,"What kind of popcorn flavor do you like?");
	 Popcorn brbb = new Popcorn(answer);
	Microwave brnb = new Microwave();
	brbb.applyHeat();
	String answer1=JOptionPane.showInputDialog(null,"How many minutes you want the popcorn to be cook?");
	Popcorn cookTimeInMinutes = new Popcorn(answer1);
	int answerr=Integer.parseInt(answer1);
	brnb.setTime(answerr);
	
	
	
	
}

private static void parseInt(String answer1) {
	// TODO Auto-generated method stub
	
}
}
