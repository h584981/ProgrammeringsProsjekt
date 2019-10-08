package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.String.*;
import static java.lang.Double.*;

public class MomsKalkulator {

	public static void main(String[] args) {
		
		/* Denne koden kan forbedres n�r vi har l�rt mer
		 * 
		 */
		/* Formler
		 * Netto er bel�p uten moms
		 * Brutto er bel�p med moms
		 * 1. Moms = Netto*MVA/100
		 * 2. Brutto = Netto + Moms
		 * Innsatt for Moms i ligning 2 f�r vi:
		 * Brutto = Netto + Netto*MVA/100 
		 *         = Netto(1 + MVA/100)		 * 
		 * => Netto = Brutto/(1 + MVA/100)
		 */
		
		final double MVA = 25.0;
		final double FAKTOR = 1 + MVA/100;
		String tallTxt = showInputDialog("Skriv inn bel�p:");
		double belop = parseDouble(tallTxt);
		/* Basert p� at bel�pet du oppgir er uten moms (eksl.meravgift)
		 * *
		 */
		double moms = belop*MVA/100;
		double medMoms = belop + moms; //
	
		String ut1 = "Tolket innlest bel�p uten moms " + format("%4.2f",belop) + "\n" + 
		              "Bel�pet med moms blir " +  format("%4.2f",medMoms) + " kroner" + "\n" +		
		              "Momsen blir " + format("%4.2f",moms) + " kroner"; 		
		
		showMessageDialog(null,ut1);
		
		// Utskrift til konsoll
		
		System.out.println("Bel�pet med moms blir " + format("%4.2f",medMoms));
		System.out.println("Momsen blir " + format("%.2f",moms));
		
		// Basert p� at bel�pet du oppgir er med moms (inkl. meravgift)
		 
		double utenMoms = belop/FAKTOR;
		moms = belop - utenMoms;
		String ut2 = "Tolket innlest bel�p med moms " + format("%4.2f",belop) + "\n" +
		              "Bel�pet uten moms blir  " + format("%4.2f",utenMoms) + " kroner" + "\n" +
				      "Momsen blir  " + format("%4.2f",moms) + " kroner"; 		
	
	showMessageDialog(null,ut2);
	
	// Utskrift til konsoll
	
	System.out.println("Bel�pet uten moms blir " + format("%.2f",utenMoms));
	System.out.println("Momsen blir " + format("%.2f",moms));
	

	}
	
}
