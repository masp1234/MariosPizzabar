import java.util.ArrayList;

public class OrderList {
  private ArrayList<Pizza> orderList = new ArrayList<>();
  private Menukort menukort = new Menukort();

  public void printList() {
    for (int i = 0; i < orderList.size(); i++) {
      System.out.println(orderList.get(i));
    }
  }

  public void addPizza(int pizzaNumber) {
    orderList.add(menukort.getList().get(pizzaNumber-1));
  }

  public void removePizza() {
    orderList.remove(0);
  }
}

