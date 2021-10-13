import java.util.ArrayList;

public class OrderList {
  ArrayList<Pizza> orderList = new ArrayList<>();


  public void printList() {
    for (int i = 0; i < orderList.size(); i++) {
      System.out.println(orderList.get(i));
    }
  }

  public void addPizza(int pizzaNumber) {

  }

  public void addPizza(String pizzaName) {

  }

  public void removePizza(String pizzaName) {

  }

  public void removePizza(int pizzaNumber) {

  }
}

