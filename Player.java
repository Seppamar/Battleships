import java.util.ArrayList;
import java.util.Scanner;
/**
 * Player
 */
public class Player {

    //instansvariablerna
    int choice;
    
    //metoderna eller behaviour
    public void player_choice() {
        //vi tar usr input i form av "matrix"
        Scanner scanner = new Scanner(System.in);
        //vi sparar i variabel som ändrar på matrix? 
        System.out.println("Give a place for your ship: ");
        this.choice = scanner.nextInt();
        


        
    }
}