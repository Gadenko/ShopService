package Model;

import java.util.HashMap;
import java.util.Scanner;

public class OrderRepo {

    HashMap<String, ProductRepo> games = new HashMap<>();
    
    public OrderRepo(){
    }
    
    public String addGame(String gameKey, ProductRepo game){
        games.put(gameKey, game);
        return  game.getGame();
    }
    
    public void placeGame(){
        System.out.println("Please choose a game id: " + toString());
        Scanner scanner = new Scanner(System.in);
        String chosenGame = scanner.nextLine();
        String game = getOrderById(chosenGame);
        System.out.println("You have ordered: " + game.toString());

    }

    public String getOrderById(String id){
        return id;
    }


    @Override
    public String toString() {
        return "\n " + games +
                "";
    }
}
