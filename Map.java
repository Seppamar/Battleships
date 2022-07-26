import java.util.ArrayList;

/**
 * Map, vad skall dess state, eller instansvariabler vara? 
 * hur är det med setters och getters? instansvariabler?
 * vi gör simplare version med arraylist för att ändra på värde
 */
public class Map {

    public ArrayList<Integer> newmap() {
        ArrayList<Integer> map  = new ArrayList<>();
        //vi lägger till 5 element av 0, vi får en tom map
        for(int i = 0; i < 4; i ++){
            map.add(i, 0);
        }
        return map;
    }

    
    
}