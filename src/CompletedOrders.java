import java.util.ArrayList;

public class CompletedOrders {
    private ArrayList<Order> completedOrders;
    private Menukort menukort = new Menukort();
    CompletedOrders(){
        completedOrders = new ArrayList();
    }
    //den pizza til completedOrders ud fra menukort. Da menukort arraylisten starter på index 0 bruger vi -1
    public void saveOrder(){
        completedOrders.add(orderList.getOrderList().get(0));
    }

    public ArrayList<Order> getCompletedOrders() {
        return completedOrders;
    }
}
