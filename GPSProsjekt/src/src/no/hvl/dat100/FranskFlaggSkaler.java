package no.hvl.dat100;
/* 
 * Programmet tegner det franske flagget. Bruker
 * kan skalere flagget ved � skrive inn en prosentsats.
 * 100 (prosent) gir "vanlig" st�rrelse, 50 halv st�rrelse,
 * 200 dobbel st�rrelse.
 * 
 */
import easygraphics.*;
import static java.lang.Integer.*;

public class FranskFlaggSkaler extends EasyGraphics {
 
  public static void main(String[] args) {
    launch(args);
  }
 
  public void run() {
    makeWindow("Det franske flagget");
 
    String tallTxt = getText("Skalering i prosent:");    
    int str = parseInt(tallTxt);
 
    int vanligBredde = 300, vanligH�yde = 200;
    int bredde = vanligBredde*str/100;
    int h�yde = vanligH�yde*str/100;
 
    setColor(0, 0, 255);  //bl�
    fillRectangle(50, 50, bredde/3, h�yde);
    setColor(255, 0, 0);  //r�d
    fillRectangle(50+2*bredde/3, 50, bredde/3, h�yde);
    
    //1.
    setColor(0, 0, 0); // svart
    drawRectangle(50, 50, bredde, h�yde);
    
    //2    
    /*
    setColor(255, 255,255); // hvit
    fillRectangle(50,50+bredde/3,bredde, h�yde);
    */
    
    }
}
