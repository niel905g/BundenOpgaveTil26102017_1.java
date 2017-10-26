package dk.niel905g;
/** Studerende.java - denne klasse skal indeholde nogle klasse-variabler,
 *  constructors og klasse-metoder, som kan beskrive
 *  datamatikerstuderende på dit hold. */

public class Studerende {
    // Declaring and initializing the variables
   private String navn = "NONAME";
   private int alder = -100;
   private String tlfNummer;
   private String hold;
   private String haarFarve;

   // no arg Constructor
   Studerende() { }

    // Constructor med navn
    Studerende(String navn) {

    }
    // Constructor med navn og alder
    Studerende(String navn, int alder){this.navn = navn; this.alder = alder;
            }
        // Constructor med navn, alder og hold
        Studerende(String navn, int alder, String hold) {
        this.navn = navn; this.alder = alder; this.hold = hold;
            }

     // Constructor med navn, alder, hold, og tlf nummer
    Studerende(String navn, int alder, String hold, String tlfNummer) {
        this.navn = navn; this.alder = alder; this.hold = hold; this.tlfNummer = tlfNummer;
            }

    // Constructor med navn, alder, hold, tlf nummer og haar farve
        Studerende(String navn, int alder, String hold, String tlfNummer, String haarFarve) {
        this.navn = navn; this.alder = alder; this.hold = hold; this.tlfNummer = tlfNummer; this.haarFarve = haarFarve;
            }

    // Set metoder
    void setNavn() {
        this.navn = navn;
        }
    void setAlder() {
        this.alder = alder;
        }
    void setTlfNummer() {
        this.tlfNummer = tlfNummer;
        }
    void setHaarFarve(String haarFarve) {this.haarFarve = haarFarve;}

    // Get metoder
    String getNavn() {
        return navn;
    }
    int getAlder() {
        return alder;
    }
    String getHold() {
        return hold;
    }
    String getTlfNummer() {
        return tlfNummer;
    }
    String getHaarFarve() { return haarFarve;}
}