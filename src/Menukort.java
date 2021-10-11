import java.util.ArrayList;

public class Menukort {
    ArrayList<Pizza> list;
    Menukort(){
        init();
    }

    public void init(){
        list = new ArrayList<>();
        Pizza pizza1 = new Pizza(1,"Vesuvio", "tomatsauce, ost, skinke og oregano", 57);
        Pizza pizza2 = new Pizza(2,"Amerikaner", "tomatsauce, ost, oksefars og oregano", 53);
        list.add(pizza1);
        list.add(pizza2);
    }

    public void printList(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public ArrayList<Pizza> getList() {
        return list;
    }

    public static void main(String[] args) {
        Menukort menukort = new Menukort();
        menukort.printList();
    }

}
