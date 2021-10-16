public class Pizza {
    private int price;
    private String name;
    private int number;
    private String description;

    Pizza(int number, String name, String description, int price){
        this.name = name;
        this.price = price;
        this.number = number;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return number + ". " + name + ": " + description + " " + price + " kr.";
    }


}

