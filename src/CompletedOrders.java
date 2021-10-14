import java.util.ArrayList;

public class CompletedOrders {
    private ArrayList<Pizza> completedOrders;
    private Menukort menukort = new Menukort();
    CompletedOrders(){
        completedOrders = new ArrayList();
    }
    public void addPizza(int pizzaNumber){
        completedOrders.add(menukort.getList().get(pizzaNumber-1));
    }


}
