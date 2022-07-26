import java.util.ArrayList;

/**
 * Gamelogic, make a simpler version, because array confuses,
 * KISS, keep it simple stupid, i will make level1
 */
public class Gamelogic {

    ArrayList<Integer> pb;
    ArrayList<Integer> cb;
    int playershot;


    public void startgame() {
        System.out.println("Welcome to battleships against computer!");
        
        //instantierar spelar objekt vars spelplanbildas med dess metod
        Player player = new Player();
        pb = player.player_battlefield();
        System.out.println(pb);
        Computer computer = new Computer();
        cb = computer.computer_battlefield();
        System.out.println(cb);

        

        //vi har spelplan för både spelare och dator, nu kan vi börja bombadera med hjälp a loop
        

        while (true) {
            //spelaren börjar bombadera
            playershot = player.player_shot();
            if (playershot == computer.c_choice) {
                System.out.println("You won!");
                break;
            }

            System.out.println("Missed, computerns turn");
            //the computer does a random choice
            int computershot = computer.computer_shot();

            if (computershot == player.p_choice) {
                System.out.println("Computer won");
                break;
            }
            else{
                System.out.println("Both missed, playerns turn");
                System.out.println(computer.c_shot);
                System.out.println(player.p_choice);
            }
        }

    }
}