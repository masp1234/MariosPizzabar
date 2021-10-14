import java.util.Scanner;

public class Parser {
    // kunne eventuelt være final
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
                    System.out.println("Hvilket nummer har pizzaen?");
                    int pizzaNumber = sc.nextInt();
                    if (menukort.getList().size() >= pizzaNumber && pizzaNumber > 0) {
                        orderList.addPizza(pizzaNumber);
                        System.out.println("Du har tilføjet " + menukort.getList().get(pizzaNumber-1).getName());
                        //completedOrders.addPizza(tal);
                    } else{
                        System.out.println("Der findes ikke en pizza med dette nummer");
                    }
                   break;
                case 4:
                    if(!(orderList.getOrderList().size() == 0)) {
                        System.out.println("Du har fjernet " + orderList.getOrderList().get(0).getName());
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
