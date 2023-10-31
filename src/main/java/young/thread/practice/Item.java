package young.thread.practice;

public class Item {
    private String name;
    public static int itemNumber = 1;

    public Item() {
        this.name = "Item_" + itemNumber;
        itemNumber++;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
