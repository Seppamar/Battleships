import java.util.ArrayList;
import java.util.Scanner;
/**
 * Player
 */
public class Player {

    //instansvariablerna
    int choicerow;
    int choicecoloumn;
    ArrayList[][] choice = new ArrayList[choicerow][choicecoloumn];

    //metoderna eller behaviour
    public void player_choice() {
        //vi tar usr input i form av "matrix"
        Scanner scanner = new Scanner(System.in);
        //vi sparar i variabel som ändrar på matrix? 
        System.out.println("Give a row and column for your ship\n Row;");
        this.choicerow = scanner.nextInt();
        

        System.out.println("Column:");
        this.choicecoloumn = scanner.nextInt();


        
    }
}