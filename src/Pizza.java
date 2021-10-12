public class Pizza {
    int price;
    String name;
    int number;
    String description;

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
