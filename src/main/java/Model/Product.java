package Model;

public class Product {


    public static ProductRepo game1 = new ProductRepo("Game 1",49.99);
    public static ProductRepo game2 = new ProductRepo("Game 2",20.99);
    public static ProductRepo game3 = new ProductRepo("Game 3", 15.99);
    public static ProductRepo game4 = new ProductRepo("Game 4",59.99);
    public static ProductRepo game5 = new ProductRepo("Game 5",39.99);
    public static ProductRepo game6 = new ProductRepo("Game 6",29.99);
    public static ProductRepo game7 = new ProductRepo("Game 7",20.01);
    public static ProductRepo game8 = new ProductRepo("Game 8",23.99);
    public static ProductRepo game9 = new ProductRepo("Game 9",40.99);


    @Override
    public String toString() {
        return "\n" +
                "game1=" + game1 +
                "game2=" + game2 +
                "game3=" + game3 +
                "game4=" + game4 +
                "game5=" + game5 +
                "game6=" + game6 +
                "game7=" + game7 +
                "game8=" + game8 +
                "game9=" + game9 +
                "";
    }

}
