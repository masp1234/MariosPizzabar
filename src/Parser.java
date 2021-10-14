import java.util.Scanner;

public class Parser {
    Menukort menukort = new Menukort();
    OrderList orderList = new OrderList();
    CompletedOrders completedOrders = new CompletedOrders();
    Scanner sc = new Scanner(System.in);

    public void run(){
        boolean programIsRunning = true;
        System.out.println("Velkommen til Mariopizzabar");
        printOptions();
        while(programIsRunning){
            switch (sc.nextInt()){
                case 1:
                    menukort.printList();
                    break;
                case 2:
                    orderList.printList();
                    break;
                case 3:
                    //vi mangler mulighed for at adde flere pizzaer på en order
                    System.out.println("Hvilket nummer har pizzaen?");
                    int tal = sc.nextInt();
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
    public void printOptions(){
        System.out.println("vælg 1 for at se menukort \nvælg 2 for at se bestillinger \nvælg 3 for at oprette bestilling \nvælg 4 for at fjerne bestilling \nvælg 5 hvis du ville have valg over muligheder \nvælg 9 hvis du vil lukke program");
    }

}
