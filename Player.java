import java.util.ArrayList;
import java.util.Scanner;
/**
 * Player
 */
public class Player {

    //instansvariablerna
    int choice;
    Map player_map = new Map();
    
    //metoderna eller behaviour
    public void player_choice() {
        //vi tar usr input i form av "matrix"
        Scanner scanner = new Scanner(System.in);
        //vi sparar i variabel som ändrar på matrix? 
        System.out.println("Give a place for your ship: ");
        this.choice = scanner.nextInt();

        //vi insätter valet i spelarets spelplan, bildar ny map
        ArrayList<Integer> p_map = player_map.newmap();
        


        
    }
}