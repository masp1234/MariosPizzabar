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

  public void printOrderList() {
    if(getOrderList().size() == 0){
      System.out.println("Bestillingslisten er tom");
    } else {
      for (int i = 0; i < getOrderList().size(); i++) {
        System.out.println("------------------------------------------------------------------");
        for (int j = 0; j < getOrderList().get(i).getListOfPizza().size(); j++) {
          System.out.println(getOrderList().get(i).getListOfPizza().get(j));
        }
      }
      System.out.println("------------------------------------------------------------------");
    }
  }

  public ArrayList<Order> getOrderList() {
    return orderList;
  }
}

