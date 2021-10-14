import java.util.Scanner;

public class Parser {
    private Menukort menukort = new Menukort();
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
                    //printer listen hvis den indeholder mindste et element
                    if(orderList.getOrderList().size() == 0){
                        System.out.println("Bestillingslisten er tom");
                    } else {
                        orderList.printList();
                    }
                    break;
                case 3:
                    //vi mangler mulighed for at adde flere pizzaer på en order
                    System.out.println("Hvilket nummer har pizzaen?");
                    int tal = sc.nextInt();
                    //udskriver navnet på pizzaen der er tilføjet
                    System.out.println("Du har tilføjet " + menukort.getList().get(tal-1).getName());
                   orderList.addPizza(tal);
                   completedOrders.addPizza(tal);
                   break;
                case 4:
                    orderList.removePizza();
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
