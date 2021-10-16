import java.util.ArrayList;

public class OrderList {
  private ArrayList<Order> orderList = new ArrayList<>();

  //Adder pizza til orderlist udfra menukort. Da menukort arraylisten starter på index 0 bruger vi -1
  public void addOrder(Order order) {
      orderList.add(order);
  }
  //remover altid den ældste i arraylisten
  public void removeOrder() {
    orderList.remove(0);
  }

  public ArrayList<Order> getOrderList() {
    return orderList;
  }
}

