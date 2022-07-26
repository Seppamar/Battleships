import java.util.ArrayList;
import java.util.Scanner;
/**
 * Player
 */
public class Player {

    //instansvariablerna
    int p_choice;
    Scanner scanner = new Scanner(System.in);
    //ny spelplan för spelaren
    Map player_map = new Map();
    int p_shot;
    

    //metoderna eller behaviour
    public ArrayList<Integer> player_battlefield() {
        //vi sparar valet, -1 för att datorn börjar från noll.
        System.out.println("Give a place for your ship: ");
        this.p_choice = scanner.nextInt() -1;

        //vi insätter valet i spelarets spelplan, bildar ny map
        ArrayList<Integer> p_map = player_map.newmap();
        
        //playerbattlefield array gets a number 1 in the chosen element
        p_map.add(this.p_choice, 1);
        
        return p_map;
    }

    //player chooses array element to shoot at
    public int player_shot() {
        System.out.println("What is your choice?");
        this.p_shot = scanner.nextInt() -1;
        return p_shot;
    }
}