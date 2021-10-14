import java.util.ArrayList;

public class CompletedOrders {
    private ArrayList<Pizza> completedOrders;
    private Menukort menukort = new Menukort();
    CompletedOrders(){
        completedOrders = new ArrayList();
    }
    //der pizza til completedOrders udfra menukort. Da menukort arraylisten starter på index 0 bruger vi -1
    public void addPizza(int pizzaNumber){
        completedOrders.add(menukort.getList().get(pizzaNumber-1));
    }


}
