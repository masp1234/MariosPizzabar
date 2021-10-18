import java.util.Scanner;

public class Parser{
    private final Menu menu = new Menu();
    private OrderList orderList = new OrderList();
    private CompletedOrders completedOrders = new CompletedOrders();
    private Scanner sc = new Scanner(System.in);

    public void run(){
        boolean programIsRunning = true;
        System.out.println("Velkommen til Marios Pizzabar!");
        printOptions();

        //laver switch over hvad brugeren kan taste
        while(programIsRunning) {
            int userInput = -1;
            boolean notAnInt = true;

            while (notAnInt) {
                if (sc.hasNextInt()) {
                    userInput = sc.nextInt();
                    notAnInt = false;
                } else {
                    sc.next();
                    System.out.println("Kan kun indtaste tal.");
                }
            }
                switch (userInput) {
                    case 1:
                        menu.printList();
                        break;
                    case 2:
                        orderList.printOrderList();
                        break;
                    case 3:
                        sc.nextLine();
                        Order order = new Order();
                        System.out.println("Indtast de ønskede pizzaer separeret med mellemrum " +
                                "og tryk derefter 'enter'");
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
                            if (menu.getList().size() >= pizzas[i] && 0 < pizzas[i]) {
                                //adder til order list
                                order.addPizza(pizzas[i]);
                            } else {
                                System.out.println("Nummer " + pizzas[i] + " er ikke på menukortet, " +
                                        "og derfor er den ikke tilføjet til bestilling");
                            }
                        }

                        //tilføjer til orderList, hvis order har 1 eller flere elementer
                        if (!(order.getListOfPizza().size() == 0))
                            //printer de tilføjede orders
                            System.out.println("Du har tilføjet:");
                        for (int i = 0; i < order.listOfPizza.size(); i++) {
                            System.out.println(order.listOfPizza.get(i));
                        }
                        orderList.addOrder(order);
                        break;
                    case 4:
                        if (!(orderList.getOrderList().size() == 0)) {
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("Du har fjernet og gemt bestillingen indeholdende:");
                            for (int i = 0; i < orderList.getOrderList().get(0).getListOfPizza().size(); i++) {
                                System.out.println(orderList.getOrderList().get(0).getListOfPizza().get(i).getName());
                            }
                            System.out.println("------------------------------------------------------------------");
                            completedOrders.getCompletedOrders().add(orderList.getOrderList().get(0));
                            orderList.removeOrder();
                        } else {
                            System.out.println("Der er ingen pizzaer i bestillingslisten");
                        }
                        break;
                    case 5:
                        printOptions();
                        break;
                    case 6:
                        if (completedOrders.getCompletedOrders().size() == 0) {
                            System.out.println("Der er ikke nogle færdiglavede ordrer");
                        } else {
                            System.out.println("Disse ordrer er udleveret");
                            for (int i = 0; i < completedOrders.getCompletedOrders().size(); i++) {
                                for (int j = 0; j < completedOrders.getCompletedOrders().get(i)
                                        .getListOfPizza().size(); j++) {
                                    System.out.println(completedOrders.getCompletedOrders()
                                            .get(i).getListOfPizza().get(j));
                                }
                            }
                        }
                        break;
                    case 9:
                        System.out.println("Lukker programmet...");
                        programIsRunning = false;
                        break;
                    default:
                        System.out.println("Du har ikke indtastet et korrekt nummer");
                }
            }

        }
    //printer de forskellige muligheder brugeren har
    public void printOptions(){
        System.out.println("""
                Vælg 1 for at se menukort\s
                Vælg 2 for at se bestillinger\s
                Vælg 3 for at oprette bestilling\s
                Vælg 4 for at fjerne og gemme bestilling i systemet\s
                Vælg 5 for at se muligheder\s
                Vælg 6 hvis du vil se en liste over alle fuldførte bestillinger\s
                Vælg 9 hvis du vil lukke program""");
    }


}
