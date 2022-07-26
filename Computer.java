import java.util.ArrayList;
import java.util.Random;

/**
 * Computer
 */
public class Computer {

    int c_choice;
    //vi gör ny spelplan åt datorn
    Map computer_map = new Map();
    Random random = new Random();
    int c_shot;
    

    public ArrayList<Integer> computer_battlefield() {
        this.c_choice = random.nextInt(5);
        ArrayList<Integer> c_map = computer_map.newmap();
        c_map.add(this.c_choice, 1);
        return c_map;
    }

    public int computer_shot() {
        this.c_shot = random.nextInt(4);
        return c_shot;
    }
}