package acme;

import java.io.IOException;

/**
 * This is the class that contains the main method, so it's where we use all of these classes.
 *
 */
public class App {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		// First initialize your smartphone using the model number and license key.
		ACMESmartphone myACMESmartphone = new ACMESmartphone(2.0, "398978fdskj");
		
		// Locate the roadrunner.
		myACMESmartphone.findRoadRunner("Santa Clara","California");
		
		// Zap the roadrunner with the amount of voltage you want.
		myACMESmartphone.zapRoadRunner(40);
		
		Dynamite myDynamite = new Dynamite();
		myDynamite.blowDynamiteLoudBang(1);
		
		myDynamite.generateDynamiteReport(225);
		System.out.println("report of roadrunners killed: " + Dynamite.rrAttempts);
	}

}
