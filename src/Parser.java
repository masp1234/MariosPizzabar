import java.util.ArrayList;
import java.util.Scanner;

public class Parser{
    private final Menukort menukort = new Menukort();
    private OrderList orderList = new OrderList();
    private CompletedOrders completedOrders = new CompletedOrders();
    private Scanner sc = new Scanner(System.in);

    public void run(){
        boolean programIsRunning = true;
        System.out.println("Velkommen til Mariopizzabar");
        printOptions();
        //laver switch over hvad brugeren kan taste
        while(programIsRunning){
            switch (sc.nextInt()){
                case 1:
                    menukort.printList();
                    break;
                case 2:
                    if(orderList.getOrderList().size() == 0){
                        System.out.println("Bestillingslisten er tom");
                    } else {
                        for (int i = 0; i < orderList.getOrderList().size(); i++) {
                            System.out.println("------------------------------------------------------------------");
                            for (int j = 0; j < orderList.getOrderList().get(i).getListOfPizza().size(); j++) {
                                System.out.println(orderList.getOrderList().get(i).getListOfPizza().get(j));
                            }
                        }
                        System.out.println("------------------------------------------------------------------");
                    }
                    break;
                case 3:
                        sc.nextLine();
                        Order order = new Order();
                        System.out.println("Indtast de ønskede pizzaer separeret med mellemrum");
                        //scanner hele linjen
                        String line = sc.nextLine();
                        //trimmer mellemrum fra start og slut
                        String newLine = line.trim();
                        //sætter alle tal seperaret med et eller flere mellemrum ind i array (s+ er regex)
                        String[] pizzaString = newLine.split("\s+");
                        //laver int array med samme længde
                        int[] pizzas = new int[pizzaString.length];
                        for (int i = 0; i < pizzas.length; i++) {
                            //sætter pizzaString ind i pizzas og parser det til ints
                                pizzas[i] = Integer.parseInt(pizzaString[i]);
                            if (menukort.getList().size() >= pizzas[i] && 0 < pizzas[i]){
                                //adder til order list
                                order.addPizza(pizzas[i]);
                            }
                            else{
                                System.out.println("Nummer " + pizzas[i] + " er ikke på menukortet, og derfor er den ikke tilføjet til bestilling");
                            }
                        }
                        //printer de tilføjede orders
                        System.out.println("Du har tilføjet:");
                        for (int i = 0; i < order.listOfPizza.size(); i++) {
                            System.out.println(order.listOfPizza.get(i));
                        }
                        //tilføger til orderList, hvis order har 1 eller flere elementer
                        if(!(order.getListOfPizza().size() == 0))
                        orderList.addOrder(order);
                   break;
                case 4:
                    if(!(orderList.getOrderList().size() == 0)) {
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("Du har fjernet bestillingen med:");
                        for (int i = 0; i < orderList.getOrderList().get(0).getListOfPizza().size(); i++) {
                            System.out.println(orderList.getOrderList().get(0).getListOfPizza().get(i).getName());
                        }
                        System.out.println("------------------------------------------------------------------");
                    orderList.removePizza();
                } else{
                    System.out.println("Der er ingen pizzaer i bestillingslisten");
                }
                    break;
                case 5:
                    printOptions();
                    break;
                case 9:
                    programIsRunning = false;
                    break;
                default:
                    System.out.println("Du har ikke indtastet et korrekt nummer");
            }
        }

    }
    //printer de forskellige muligheder brugeren har
    public void printOptions(){
        System.out.println("vælg 1 for at se menukort \nvælg 2 for at se bestillinger \nvælg 3 for at oprette bestilling \nvælg 4 for at fjerne bestilling \nvælg 5 hvis du ville have valg over muligheder \nvælg 9 hvis du vil lukke program");
    }


}
