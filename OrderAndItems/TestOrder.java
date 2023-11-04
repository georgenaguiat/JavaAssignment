package OrderAndItems;

public class TestOrder {
    public static void main(String[] args) {
        Item item1 = new Item("mocha", 5.5);
        Item item2 = new Item("latte", 4.5);
        Item item3 = new Item("drip coffee", 2.5);
        Item item4 = new Item("cappuccino", 6.5);

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        System.out.println(order1.name);

        order2.addItem(item1);
        order2.orderReady();
        System.out.println(order2.name + " Total is " + order2.total);
        System.out.println(order2.name + " order is " + (order2.ready ? "ready" : "not ready"));

        order3.addItem(item4);
        System.out.println(order3.name + " Total is " + order3.total);
        System.out.println(order3.name + " order is " + (order3.ready ? "ready" : "not ready"));

        order4.addItem(item2);
        order4.addItem(item2);
        System.out.println(order4.name + " Total is " + order4.total);
        System.out.println(order4.name + " order is " + (order4.ready ? "ready" : "not ready"));

        order1.orderReady();
        System.out.println(order1.name + " order is " + (order1.ready ? "ready" : "not ready"));
    }
}
