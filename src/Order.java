import java.util.ArrayList;

public class Order {
    ArrayList<Pizza> listOfPizza = new ArrayList<>();
    Menukort menukort = new Menukort();
    //adder pizza
    public void addPizza(int pizzaNumber) {
        listOfPizza.add(menukort.getList().get(pizzaNumber - 1));
    }


    public ArrayList<Pizza> getListOfPizza() {
        return listOfPizza;
    }

}
