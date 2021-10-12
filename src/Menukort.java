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
        Pizza pizza3 = new Pizza(3,"Casiatore", " tomatsauce, ost, pepperoni og oregano", 57);
        Pizza pizza4 = new Pizza(4, "Carbonara", "tomatsauce, ost, kodsauce, spaghetti, cocktailpølser og oregano", 63);
        Pizza pizza5 = new Pizza (5, "Dennis", "tomaatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", 65);
        Pizza pizza6 = new Pizza (6, "Bertil", "tomatsauce, ost, bacon, oregano", 57);
        Pizza pizza7 = new Pizza (7, "Silvia", "tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano", 61);
        Pizza pizza8 = new Pizza (8, "Victoria", "tomatsauce, ost, skinke, ananas, champignon, løg og oregano", 61);
        Pizza pizza9 = new Pizza (9, "Toronfo", "tomatsauce, ost, skinke, bacon, kebab, chili og oregano",61);
        Pizza pizza10 = new Pizza (10, "Capricciosa", "tomatsauce, ost, skinke, champignon og oregano",61);
        Pizza pizza11 = new Pizza (11, "Hawai", "tomatsauce, ost, skinke, ananas og oregano", 61);
        Pizza pizza12 = new Pizza (12, "Le Blissola", "tomatsauce, ost, skinke, rejer og oregano", 61);
        Pizza pizza13 = new Pizza (13, "Venezia", "tomatsauce, ost, skinke, bacon og oregano", 61);
        Pizza pizza14 = new Pizza (14, "Mafia", "tomatsauce, ost, pepperoni, bacon, løg, oregano", 61);


        list.add(pizza1);
        list.add(pizza2);
        list.add(pizza3);
        list.add(pizza4);
        list.add(pizza5);
        list.add(pizza6);
        list.add(pizza7);
        list.add(pizza8);
        list.add(pizza9);
        list.add(pizza10);
        list.add(pizza11);
        list.add(pizza12);
        list.add(pizza13);
        list.add(pizza14);
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
