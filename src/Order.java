import java.util.ArrayList;

public class Order {

    ArrayList<Pizza> listOfPizza = new ArrayList<>();
    Menu menu = new Menu();
    //Vi får inputnummeret fra brugeren og minuser med 1, så vi får indexnummeret i menulisten
    public void addPizza(int pizzaNumber) {
        listOfPizza.add(menu.getList().get(pizzaNumber - 1));
    }

    public ArrayList<Pizza> getListOfPizza() {
        return listOfPizza;
    }

}
