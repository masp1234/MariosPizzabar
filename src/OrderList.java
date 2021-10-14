import java.util.ArrayList;

public class OrderList {
  private ArrayList<Pizza> orderList = new ArrayList<>();
  private Menukort menukort = new Menukort();
  //printer liste over bestillingerne
  public void printList() {
    for (int i = 0; i < orderList.size(); i++) {
      System.out.println(orderList.get(i));
    }
  }
  //Adder pizza til orderlist udfra menukort. Da menukort arraylisten starter på index 0 bruger vi -1
  public void addPizza(int pizzaNumber) {
    orderList.add(menukort.getList().get(pizzaNumber-1));
  }
  //remover altid den ældste i arraylisten
  public void removePizza() {
    orderList.remove(0);
  }

  public ArrayList<Pizza> getOrderList() {
    return orderList;
  }
}

