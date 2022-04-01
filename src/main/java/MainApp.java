import Model.OrderRepo;
import Model.Product;
import Model.ProductRepo;

public class MainApp {

    public static void main(String[] args) {

        OrderRepo gameStore = new OrderRepo();

        gameStore.addGame(String.valueOf(13), Product.game1);
        gameStore.addGame(String.valueOf(14), Product.game2);
        gameStore.addGame(String.valueOf(19), Product.game3);
        gameStore.addGame(String.valueOf(25), Product.game4);
        gameStore.addGame(String.valueOf(30), Product.game5);
        gameStore.addGame(String.valueOf(31), Product.game6);
        gameStore.addGame(String.valueOf(40), Product.game7);
        gameStore.addGame(String.valueOf(42), Product.game8);
        gameStore.addGame(String.valueOf(45), Product.game9);

        gameStore.placeGame();



    }

}
