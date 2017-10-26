package dk.niel905g;

import java.util.Scanner;

/** Start.java - skal indeholde main() metoden,
 * som bringer de andre 3 klasser i spil.*/

public class Start {

    public static void main(String[] args) {
	// Aflæser objecterne fra DatHoldet

        DatHoldet hold = new DatHoldet();

        System.out.println("\nNavn: " + hold.stud1.getNavn() + ", Hold: " + hold.stud1.getHold()
        + ", alder: " + hold.stud1.getAlder() + ", TlfNummer: " + hold.stud1.getTlfNummer() + ", Hår farve: " + hold.stud1.getHaarFarve());
        System.out.println("Navn: " + hold.stud2.getNavn() + ", Hold: " + hold.stud2.getHold()
                + ", alder: " + hold.stud2.getAlder() + ", TlfNummer: " + hold.stud2.getTlfNummer() + ", Hår farve: " + hold.stud2.getHaarFarve());
        System.out.println("Navn: " + hold.stud3.getNavn() + ", Hold: " + hold.stud3.getHold()
                + ", alder: " + hold.stud3.getAlder() + ", TlfNummer: " + hold.stud3.getTlfNummer() + ", Hår farve: " + hold.stud3.getHaarFarve());
        System.out.println("Navn: " + hold.stud4.getNavn() + ", Hold: " + hold.stud4.getHold()
                + ", alder: " + hold.stud4.getAlder() + ", TlfNummer: " + hold.stud4.getTlfNummer() + ", Hår farve: " + hold.stud4.getHaarFarve());

        System.out.println("");

        MineMetoder metoder = new MineMetoder();
        metoder.doWhileMetode();
        metoder.ShowCurrentTimeMethod();


    }
}