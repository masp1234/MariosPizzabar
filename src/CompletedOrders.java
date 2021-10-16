import java.util.ArrayList;

public class CompletedOrders {
    private ArrayList<Order> completedOrders;
    CompletedOrders(){
        completedOrders = new ArrayList();
    }


    public ArrayList<Order> getCompletedOrders() {
        return completedOrders;
    }
}
