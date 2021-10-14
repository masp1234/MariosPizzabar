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

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return number + ". " + name + ": " + description + " " + price + " kr.";
    }
}
