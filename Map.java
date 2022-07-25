/**
 * Map, vad skall dess state, eller instansvariabler vara? 
 * hur är det med setters och getters? 
 */
public class Map {
    public void newmap() {
        int map[][]  = new int[3][3];
        
        //vi går igenom rows
        for (int i = 0; i < map.length; i ++){
            System.out.println();
            //nested loop möjliggör gå igenom columns
            for(int j = 0; j < map[i].length; j++){
                System.out.println(map[i][j] + " ");
            }
            
        }
        
    }
    
}