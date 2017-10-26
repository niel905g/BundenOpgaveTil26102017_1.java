package dk.niel905g;
import java.util.Scanner;
/** MineMetoder.java - skal indeholde minimum 5 ting, der illustrerer det,
 *  du har lært i september, f.eks. if, for, while, Random, Date, enum, Scanner,
 *  String eller andet, vi har snakket om.
 *  Skriv kommentarer, der viser din forståelse af koden.  */

public class MineMetoder {
    // 1. Brug af Random Class: Set Lotto nr randomly;
    private int vinderNr1 = (int) (Math.random() * 5 + 2);
    private int vinderNr2 = (int) (Math.random() * 2 + 1);

    // Print af 2 random valgte lotto vinder nr!
    { System.out.println("\nMuligt Vinder Nummre: " + vinderNr1 + " og " + vinderNr2); }

    // 2. do-while loop & 3. Scanner input virker nu, defineret som en metode og rapporteret i Start!
 //   public void TestDoWhile {
        //public void main(String[] args) {
    public void doWhileMetode(){
    int data;
            int sum = 0;
            // 3. Scanner with input from keyboard
            Scanner input = new Scanner(System.in);
            // Keep reading data until input is 0
            do {
                // Read the data
                System.out.println("Enter an integer (the input ends if it is 0): ");
                data = input.nextInt();
                sum += data;
            } while (data != 0);
            System.out.println("The sum is " + sum);
        }
    //}
    // 4. Brug af enum class konstanten

         // public enum haarFarve {white, brown, blond, gray, black, red;}


    haarFarve wh, br, bl, gr, bc, rd;

    // 5. Displaying the current time, using the currentTimeMillis method - virker også!
    //

    public void ShowCurrentTimeMethod() {
        // Obtain total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        // Turning them into seconds, since Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        // Turning them into something understandable in minutes
        long currentSecond = totalSeconds % 60;
        // Turning the understood into minutes
        long totalMinutes = totalSeconds / 60;
        // Turning it into hours
        long totalHours = totalMinutes / 60;
        // Compute the current hour
        long currentHour = totalHours % 24;


        System.out.println("Current DK Time: " + (currentHour + 2) + ":" + (totalMinutes % 60) + ":" + currentSecond);
    }
}
