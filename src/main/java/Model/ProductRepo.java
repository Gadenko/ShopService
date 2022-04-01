package Model;

import java.util.Objects;

public class ProductRepo {

    public String game;
    public double price;


    public ProductRepo(String game, double price) {
        this.game = game;
        this.price = price;

    }

    public String getGame() {
        return game;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductRepo that = (ProductRepo) o;

        if (Double.compare(that.price, price) != 0) return false;
        return Objects.equals(game, that.game);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = game != null ? game.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return " " + game + "" +
                ": Price = " + price +"€"+
                "\n";
    }
}
